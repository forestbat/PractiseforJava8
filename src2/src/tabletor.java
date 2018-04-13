import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

public class tabletor {
    public static void main(String... args) throws Exception {
        if (args.length < 1) {
            System.out.print("arguments:annotated classes");
            System.exit(0);
        }
        for (String name : args) {
            Class<?> cl = Class.forName(name);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if (dbTable == null) {
                System.out.print(name);
                continue;
            }
            String tableName = dbTable.name();
            //If the name is empty,use the Class name:
            if (tableName.length() < 1)
                tableName = cl.getName().toUpperCase();
            List<String> columnDefs = new ArrayList<String>();
            for (Field field : cl.getDeclaredFields()) {
                String columnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if (anns.length < 1)
                    continue;
                if (anns[0] instanceof SQLInteger) {
                    SQLInteger sInt = (SQLInteger) anns[0];
                    //Use field name if name not specified
                    if (sInt.name().length() < 1)
                        columnName = field.getName().toUpperCase();
                    else columnName = sInt.name();
                    columnDefs.add(columnName);
                }
                if(anns[0] instanceof SQLString){
                    SQLString sString=(SQLString)anns[0];
                    //Use field name if name is not spicified.
                    if(sString.name().length()<1)
                        columnName=field.getName().toUpperCase();
                    else columnName=sString.name();
                    columnDefs.add(columnName+sString.value());
                }
                StringBuilder createCommand=new StringBuilder(tableName);
                for(String columnDef:columnDefs)
                    createCommand.append(columnDef);
                //Remove trailing comma
                String tableCreate=createCommand.substring(0,createCommand.length()-1);
                //System.out.println(className+tableCreate);
            }
        }

    }
}
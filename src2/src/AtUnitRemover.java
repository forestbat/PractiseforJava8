/*import javassist.*;
import javassist.bytecode.stackmap.TypeData;
import javassist.expr.*;
import javassist.bytecode.*;
import java.io.*;

public class AtUnitRemover implements ProcessFiles.Strategy {
    private static boolean remove=false;
    public static void main(String...args) throws Exception{
        if(args.length>0&&args[0].equals("-r")){
            remove=true;
            String[] nargs=new String[args.length-1];
            System.arraycopy(args,1,nargs,0,nargs.length);
            args=nargs;
        }
        new ProcessFiles(new AtUnitRemover(),"class").start(args);
    }
    public void process(File file){
        boolean modified=false;
        try{
            String cName=TypeData.ClassName.thisClass(BinaryFile.read(cFile));
            if(!cName.contains(""))
        }catch (Exception e){}
    }

}*/

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Directory {
    public static File[] local(File dir,String regex){
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern=Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    public static File[] local(String path,String regex){//Overloaded
        return local(new File(path),regex);
    }
    public static class TreeInfo implements Iterable<File>{
        public List<File> files=new ArrayList<File>();
        public List<File> dirs=new ArrayList<File>();
        public Iterator<File> iterator(){return files.iterator();}
        void addAll(TreeInfo other){
            files.addAll(other.files);
            files.addAll(other.dirs);
        }
       public String toString() {
            return PPrint.pformat(dirs)+PPrint.pformat(files);
       }
       public static TreeInfo walk(String start,String regex){
            return recurseDirs(new File(start),regex);
        }
        static TreeInfo recurseDirs(File startDir,String regex){
            TreeInfo result=new TreeInfo();
            for(File item:startDir.listFiles()){
                if(item.isDirectory()){
                    result.dirs.add(item);
                result.addAll(recurseDirs(item,regex));}
                else if(item.getName().matches(regex))
                    result.files.add(item);
            }
            return result;
        }
    }
}
class PPrint{
    public static String pformat(Collection<?> c){
        if(c.size()==0) return "[]";
        StringBuilder result=new StringBuilder();
        for(Object item:c){
            if(c.size()!=1)
                result.append("\n");
            result.append(item);
        }
        if(c.size()==1)
            result.append("\n");
        result.append("]");
        return result.toString();
    }
    public static void pprint(Collection<?> c){
        System.out.format(pformat(c));
    }
    public static void pprint(Object c){
        System.out.println(pformat(Arrays.asList(c)));
    }
}
class DirectoryDemo{
    public static void main(String...args){
        //All directories:
        PPrint.pprint(Directory.TreeInfo.walk(".","T.*"));
    }
}

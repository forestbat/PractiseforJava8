import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.Calendar;

public class ClassTypeCapture<T> {
    Class<T> kind;
    public ClassTypeCapture(Class<T> kind){
        this.kind=kind;
    }
    public boolean f(Object args){
        return kind.isInstance(args);
    }
    public static void main(String[] args){
        ClassTypeCapture<Calendar.Builder> cttl=new ClassTypeCapture<Calendar.Builder>(Calendar.Builder.class);
        System.out.println(cttl.f(new Calendar.Builder()));
        //System.out.println(cttl.f(new Calendar.Builder()));

}}

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


/*class MixinProxy implements InvocationHandler{
    Map<String,Object> delegatesByMethod;
    public MixinProxy(TwoTuple<Object,Class<?>>...pairs){
        delegatesByMethod=new HashMap<String,Object>();
        for(TwoTuple<Object,Class<?>> pair:pairs)
            for(Method method:pair.getClass().getMethods())
                String methodName=method.getName();
        //The first interface in the map implements the
        delegatesByMethod.put(methodName,pair.first)
    }
}
public class DynamicProxyMixin {
}*/

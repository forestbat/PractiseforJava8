import java.lang.reflect.*;
interface Interface{
    void doSomething();
    void somethingElse(String arg);
}
class RealObject implements Interface{
    public void doSomething(){System.out.println("doSomething");}
    public void somethingElse(String args){
        System.out.println("somethingElse"+args);
    }
}
class SimpleProxy implements Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied=proxied;
    }
    public void doSomething(){System.out.println("SimpleProxy doSomething");}
    public void somethingElse(String args){System.out.println("something Else");}
}
public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}

    class DynamicProxyHandler implements InvocationHandler {
        private Object proxied;

        public DynamicProxyHandler(Object proxied) {
            this.proxied = proxied;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("**** proxy:" + proxy.getClass() + ",method:" + method + ",args:" + args);
            if (args != null)
                for (Object arg : args)
                    System.out.println("" + arg);
            return method.invoke(proxied, args);
        }
    }

    class SimpleDynamicProxy {
        public static void consumer(Interface iface) {
            iface.doSomething();
            iface.somethingElse("0");
        }

        public static void main(String[] args) {
            RealObject real = new RealObject();
            consumer(real);
            //Insert a proxy and call again:
            Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
            consumer(proxy);
        }
    }
    class MethodSelector implements InvocationHandler {
        private Object proxied;

        public MethodSelector(Object proxied) {
            this.proxied = proxied;
        }

        public Object invoke(Object Proxy, Method method, Object[] args) throws Throwable{
            if(method.getName().equals("interesting"))
                System.out.println("Proxy detected the interesting method");
            return method.invoke(proxied,args);
        }
    }
    interface SomeMethods{
    void boring();
    void boring2();
    void interesting(String args);
    void boring3();
    }
    class Implementation implements SomeMethods{
    public void boring(){System.out.println("boring1");}
    public void boring2(){System.out.println("boring2");}
    public void interesting(String args){System.out.println("interesting"+args);}
    public void boring3(){System.out.println("boring3");}
    }
    class SelectingMethods{
    public static void main(String...args){
        SomeMethods proxy=(SomeMethods)Proxy.newProxyInstance(SomeMethods.class.getClassLoader(),new Class[]{SomeMethods.class},new MethodSelector(new Implementation()));
        proxy.boring();
        proxy.boring2();
        proxy.boring3();
        proxy.boring3();
    }
    }



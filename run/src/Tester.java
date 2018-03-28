import java.util.*;
class TestParam{
    public final int size;
    public final int loops;
    public TestParam(int size,int loops){
        this.size=size;
        this.loops=loops;
    }
    public static TestParam[] array(int...values){
        int size=values.length/2;
        TestParam[] result=new TestParam[size];
        int n=0;
        for(int i=0;i<size;i++)
            result[i]=new TestParam(values[n++],values[n++]);
        return result;
    }
    //Convert a String array to a TestParam array:
    public static TestParam[] array(String[] values){
        int[] vals=new int[values.length];
        for(int i=0;i<vals.length;i++)
            vals[i]=Integer.decode(values[i]);
        return array(vals);
    }
}
public class Tester<C> {
    public static int fieldWidth=8;
    public static TestParam[] defaultParams=TestParam.array(10,30000,100,5000,1000,10000);
    //Override this to modify pre-test initialization:
    private C container;
    protected C initialize(int size){return container;}
    private String headline="";
    private List<Tester<C>> tests;
    private static String stringField(){
        return "%"+fieldWidth+"s";
    }
    private static String numberField(){
        return "%"+fieldWidth+"d";
    }
    private static int sizeWidth=5;
    private static String sizeField="%"+sizeWidth+"s";
    private TestParam[] paramList=defaultParams;
    public Tester(C container,List<Tester<C>> tests,TestParam[] paramList){
        //this(container,tests);
        this.paramList=paramList;
    }
    public void setHeadline(String newHeadLine){
        headline=newHeadLine;
    }
    //Generic methods for convenience:
    public static <C> void run(C cntnr,List<Tester<C>> tests){
      // new Tester<C>(cntnr,tests).timedTest;
    }
    public static <C>void run(C cntnt,List<Tester<C>> tests,TestParam[] paramList){
        new Tester<C>(cntnt,tests,paramList).timedTest();
    }
    private void displayHeader(){
        //Calculate width and pad with minus
        int width=fieldWidth*tests.size()+sizeWidth;
        int dashLength=width-headline.length()-1;
        StringBuilder head=new StringBuilder(width);
        for(int i=0;i<dashLength/2;i++)
            head.append('-');
        head.append(headline);
        for(int i=0;i<dashLength/2;i++)
            head.append('-');
    }
    //Run the tests for this container:
    public void timedTest(){
        displayHeader();
        for(TestParam param:paramList){
            System.out.format(sizeField,param.size);
            for(Tester<C> test:tests){
                C kontainer=initialize(param.size);
                long start=System.nanoTime();
                //Call the overriden method:
                //int reps=tests.test(kontainer,param);
                long duration=System.nanoTime()-start;
                //long timePerRep=duration/reps;
            }
        }
    }

}

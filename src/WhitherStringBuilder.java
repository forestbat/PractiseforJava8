public class WhitherStringBuilder {
    public String implicit(String... builds) {
        String result = "";
        for (int i = 0; i < builds.length; i++)
            result += builds[i];
        return result;
    }
}
   /* public String explicit(String...builds){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<builds.length;i++)
            result.append(builds[i]);
        return result.toString();
    }
}*/

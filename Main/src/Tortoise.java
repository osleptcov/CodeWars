public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        double s1=g;

        if(v1>v2) return null;

        double v1PerSecond=Double.valueOf(v1) /3600;
        double v2PerSecond=Double.valueOf(v2)/3600;
        int [] result =  {0,0,0};
        int sec=0;
        double s2=0;
        do {
            s1+=v1PerSecond;
            s2+=v2PerSecond;
            sec++;

        }while (s1-s2>v2PerSecond-v1PerSecond);

        if (sec>60){
            result[2]=sec%60;
            result[1]=sec/60;
        }
        if (result[1]>60){
            result[0]=result[1]/60;
            result[1]=result[1]%60;
        }
        return result;
    }
}
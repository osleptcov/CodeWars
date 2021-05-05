import java.util.*;
import java.util.stream.Collectors;
public class Carboat {

    public static String howmuch(int m, int n) {
        int bgn; int end;
        if (m>n){
            bgn =n;
            end =m;
        }
        else{
            bgn =m;
            end =n;
        }


        ArrayList<Integer> intList = new ArrayList<Integer>() {{ for (int i=bgn;i<=end; i++) add(i); }};
        List<Integer> intList_short = intList.stream().filter(s-> s % 7==2 && s % 9==1).collect(Collectors.toList());
        String res ="[";
        for (int i :intList_short) {

            res+="[M: "+i+" B: "+i/7+" C: "+i/9+"]";

        }
        res+="]";
        return res;
    }
}
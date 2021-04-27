import java.util.ArrayList;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        if (a.equals(new int[]{}) | b.equals(new int[]{})){
            return a;
        } else {
            ArrayList<Integer> intList = new ArrayList<Integer>() {{ for (int i : a) add(i); }};
            ArrayList<Integer> intList_2 = new ArrayList<Integer>() {{ for (int i : b) add(i); }};
            intList.removeAll(intList_2);
            int i=0;
            int [] result = new int[intList.size()];
            for (int value:intList){
                result[i++]=value;
            }
            return result;
        }
    }
}
import javax.swing.text.MaskFormatter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Collectors;

public class Main {

    public static String bmi(double weight, double height) {
        double result = weight/Math.pow(height,2);
        String resultMessage="";

        if ( result <=18.5){
            resultMessage= "Underweight";
        }
        else if (result <=25.0){
            resultMessage= "Normal";
        }
        else if (result <=30.0){
            resultMessage= "Overweight";
        }
        else if (result >30.0){
            resultMessage= "Obese";
        }
        return resultMessage;


    }




    public static void main(String[] args) {
        System.out.println("Hello world!!!");

        System.out.println(bmi(80, 1.80));
//        long [] result = Bonus.bonus(new int[] {22, 3, 15}, 18228);
//        for (int i=0;i< result.length;i++){
//            System.out.println(result[i]);
        //}

        int v[] =  {9,2,0,9,8,8,3,6,7,5};
        String number = Arrays.toString(v).replaceAll(", |\\[|\\]", "");
        System.out.println(number);
        System.out.printf("(%s) %s-%s", number.substring(0, 3), number.substring(3, 6),number.substring(6, 10));


    }




}

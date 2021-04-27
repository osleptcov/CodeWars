import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

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




    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        System.out.println("Hello world!!!");

        System.out.println(bmi(80, 1.80));
        //long [] result = Bonus.bonus(new int[] {22, 3, 15}, 18228);
       // for (int i=0;i< result.length;i++){
         //   System.out.println(result[i]);
        String s = "<prod><name>drill</name><prx>99</prx><qty>5</qty></prod>\n\n" +
                "<prod><name>hammer</name><prx>10</prx><qty>50</qty></prod>\n\n" +
                "<prod><name>screwdriver</name><prx>5</prx><qty>51</qty></prod>\n\n" +
                "<prod><name>table saw</name><prx>1099.99</prx><qty>5</qty></prod>\n\n" +
                "<prod><name>saw</name><prx>9</prx><qty>10</qty></prod>\n\n" +
                "<prod><name>chair</name><prx>100</prx><qty>20</qty></prod>\n\n" +
                "<prod><name>fan</name><prx>50</prx><qty>8</qty></prod>\n\n" +
                "<prod><name>wire</name><prx>10.8</prx><qty>15</qty></prod>\n\n" +
                "<prod><name>battery</name><prx>150</prx><qty>12</qty></prod>\n\n" +
                "<prod><name>pallet</name><prx>10</prx><qty>50</qty></prod>\n\n" +
                "<prod><name>wheel</name><prx>8.80</prx><qty>32</qty></prod>\n\n" +
                "<prod><name>extractor</name><prx>105</prx><qty>17</qty></prod>\n\n" +
                "<prod><name>bumper</name><prx>150</prx><qty>3</qty></prod>\n\n" +
                "<prod><name>ladder</name><prx>112</prx><qty>12</qty></prod>\n\n" +
                "<prod><name>hoist</name><prx>13.80</prx><qty>32</qty></prod>\n\n" +
                "<prod><name>platform</name><prx>65</prx><qty>21</qty></prod>\n\n" +
                "<prod><name>car wheel</name><prx>505</prx><qty>7</qty></prod>\n\n" +
                "<prod><name>bicycle wheel</name><prx>150</prx><qty>11</qty></prod>\n\n" +
                "<prod><name>big hammer</name><prx>18</prx><qty>12</qty></prod>\n\n" +
                "<prod><name>saw for metal</name><prx>13.80</prx><qty>32</qty></prod>\n\n" +
                "<prod><name>wood pallet</name><prx>65</prx><qty>21</qty></prod>\n\n" +
                "<prod><name>circular fan</name><prx>80</prx><qty>8</qty></prod>\n\n" +
                "<prod><name>exhaust fan</name><prx>62</prx><qty>8</qty></prod>\n\n" +
                "<prod><name>cattle prod</name><prx>990</prx><qty>2</qty></prod>\n\n" +
                "<prod><name>window fan</name><prx>62</prx><qty>8</qty></prod>";
        System.out.println("<?xml version=\"1.0\"encoding=\"UTF-8\"?>\n" +"<report>\n"+
                "<Catalog>\n"+s+"\n</Catalog>"+"\n</report>");
        String r =Catalog.catalog(s,"fan");
        System.out.println(r);
        }
    }






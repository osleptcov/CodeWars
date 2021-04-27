import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.tools.Tool;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
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


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        System.out.println("Hello world!!!");

        System.out.println(bmi(80, 1.80));
        //long [] result = Bonus.bonus(new int[] {22, 3, 15}, 18228);
       // for (int i=0;i< result.length;i++){
         //   System.out.println(result[i]);
       /* String s =
                "<prod><name>drill</name><prx>99</prx><qty>5</qty></prod>\n\n" +
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

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(s)));
        NodeList toolsList = document.getDocumentElement().getElementsByTagName("prod");

        for (int i = 0; i < toolsList.getLength(); i++) {
            Node tool = toolsList.item(i);

            // Получение атрибутов каждого элемента
            NamedNodeMap attributes = tool.getAttributes();

            // Добавление сотрудника. Атрибут - тоже Node, потому нам нужно получить значение атрибута с помощью метода getNodeValue()
//            tool.add(new Tool(attributes.getNamedItem("name").getNodeValue(), attributes.getNamedItem("job").getNodeValue()));
        }
        */
        System.out.println(arrayDiff(new int [] {1,2,2}, new int[] {2}));
        // Вывод информации о каждом сотруднике
       // for (Employee employee : employees)

    }
    }






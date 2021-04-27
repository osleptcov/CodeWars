import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    public static String catalog(String s, String article) throws ParserConfigurationException, IOException, SAXException {
        String result="";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +"<report>\n"+
                "<Catalog>\n"+s+"\n</Catalog>"+"\n</report>")));
        Element catalogElement =(Element) document.getElementsByTagName("Catalog").item(0);

        NodeList toolsNodeList = document.getDocumentElement().getElementsByTagName("prod");

        List<Tool> toolsList = new ArrayList<>();

        for (int i = 0; i < toolsNodeList.getLength(); i++) {
            if (toolsNodeList.item(i).getNodeType()==Node.ELEMENT_NODE){
                Element toolsElement= (Element) toolsNodeList.item(i);
                Tool tool =new Tool();

                NodeList childNodes =toolsElement.getChildNodes();

                for (int j=0; j<childNodes.getLength();j++) {
                    if (childNodes.item(j).getNodeType()==Node.ELEMENT_NODE) {
                        Element childElement = (Element) childNodes.item(j);
                        switch (childNodes.item(j).getNodeName()) {
                            case "name": {
                                tool.setName(childElement.getTextContent());

                            }
                            break;

                            case "qty": {
                                tool.setQty(Integer.valueOf(childElement.getTextContent()));

                            }
                            break;
                            case "prx": {
                                tool.setPrice(Double.valueOf(childElement.getTextContent()));

                            }
                            break;
                        }
                    }

                }
                toolsList.add(tool);
            }


        }

        for (Tool t: toolsList){
            String check = t.getName();
            if (check.contains(article))
                result += t.getName() + " > prx: $" + Double.toString(t.getPrice()) + " qty: " + Integer.toString(t.getQty())+"\n";

        }
        return result;
    }


}
 class Tool{
    private String name;
    private double price;
    private int qty;

     public void setName(String name) {
         this.name = name;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public void setQty(int qty) {
         this.qty = qty;
     }

     public double getPrice() {
         return price;
     }

     public int getQty() {
         return qty;
     }

     public String getName() {
         return name;
     }
 }
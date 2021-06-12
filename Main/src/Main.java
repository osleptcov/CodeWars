import javax.swing.text.MaskFormatter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        String type ="sofa";
        FurnitureFactory furnitureFactory = createFurnitureByType(type);
        Furniture furniture = furnitureFactory.createFurniture();

        furniture.give();
        furniture.sell();


    }
     static FurnitureFactory createFurnitureByType(String type){

        if (type.equalsIgnoreCase("chair")) {
            return new ChairFurnitureFactory();
        }
        else if(type.equalsIgnoreCase("table")){
            return  new TableFurnitureFactory();
        }
        else if (type.equalsIgnoreCase("sofa")){
            return  new SofaFurnitureFactory();
        }
        else{
            throw new RuntimeException(type+" is unknown furniture type");
        }

    }

}




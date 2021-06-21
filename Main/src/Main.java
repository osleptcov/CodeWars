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
        FurnitureFactory furnitureFactory =  new FurnitureFactory();
        Furniture furniture = furnitureFactory.createFurnitureByType(type);

        furniture.give();
        furniture.sell();


    }


}




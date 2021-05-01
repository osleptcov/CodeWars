import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {
    public static String order(String words) {

        if(words == null || words.equals("")) {
            return "";
        }
        else {
            List <String> sList=Stream.of(words.split(" ")).collect(Collectors.toList());
            Map<String,Long> map= new HashMap<>();

            for (String sL : sList){
                map.put(sL, Long.parseLong(sL.replaceAll("[^0-9]", "")));
            }
            return map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(s1->s1.getKey()).collect(Collectors.joining(" "));
        }

    }
}

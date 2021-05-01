import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<String,Long> map= Stream.of(text.split("")).map(w -> w.toUpperCase()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return (int)map.entrySet().stream().filter( f -> f.getValue()>1).count();
    }
}

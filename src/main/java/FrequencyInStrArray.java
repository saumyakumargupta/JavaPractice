import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyInStrArray {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> stationaryMap = stationeryList.stream().collect(Collectors.groupingBy(n -> n,Collectors.counting()));

        System.out.println(stationaryMap);
    }
}

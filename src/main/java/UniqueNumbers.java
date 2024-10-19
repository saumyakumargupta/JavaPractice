import java.util.Arrays;
import java.util.List;

public class UniqueNumbers
{
    public static void main(String[] args)
    {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueStrings = listOfStrings.stream().distinct().toList();
        System.out.println(uniqueStrings);
    }
}
import java.util.*;

public class EvenNumbers {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n%2 == 0).toList();

        for (int num: evenNumbers){
            System.out.println(num + " ");
        }
    }

}

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise27 {
    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(5,10,2,8,7));
        printIntArray(numbers);
    }

    public static void printIntArray(ArrayList<Integer> intArray){
        System.out.println(intArray);
    }
}

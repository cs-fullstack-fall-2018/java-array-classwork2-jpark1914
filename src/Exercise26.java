import java.util.ArrayList;
import java.util.Arrays;

public class Exercise26 {

    public static void main(String[] args){
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.addAll(Arrays.asList("Bob", "Ross", "Teddy", "Pendegrass"));
        System.out.println(studentList.get(2));

    }
}

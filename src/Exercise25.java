import java.util.ArrayList;

public class Exercise25 {

    public static void main(String[] args) {
        ArrayList<String> squadList = new ArrayList<String>();
        squadList.add("Bob");
        squadList.add("John");
        squadList.add("Kenn");
        squadList.add("Kevin");

        squadList.remove("Kenn");
        System.out.println(squadList);
        System.out.println(squadList.size());
        if(squadList.contains("Kevin")){
            System.out.println(squadList.get(2));
        } else{
            System.out.println("ERROR");
        }
    }
}

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        // Add keys and values (Name, Age)
        people.put("KAZIM", 28);
        people.put("İSHAK", 27);
        people.put("HACİ", 30);
        people.put("MAHSUM", 29);
        people.remove("KAZIM");

        for (String i : people.keySet()) {
            System.out.println("key : " + i + " value: " + people.get(i));

        }
    }
}
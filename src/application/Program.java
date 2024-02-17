package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Matheus");
        cookies.put("email", "matheus@gmail.com");
        cookies.put("phone","984476869");

        cookies.remove("email");
        cookies.put("phone", "981909750");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}

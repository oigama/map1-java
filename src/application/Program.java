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

        System.out.println("ALL COOKIES");
        for(String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}

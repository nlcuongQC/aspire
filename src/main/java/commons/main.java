package commons;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String a = "Master Chef Project";
        print(a);
    }

    public static void print(String text) {
        StringBuilder a = new StringBuilder();
        char          c;
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            a.append(Character.isUpperCase(c) ? c + "" : "");
        }
        System.out.println(a);
    }
}

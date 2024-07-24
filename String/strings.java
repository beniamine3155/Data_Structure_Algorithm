package String;

import java.util.Scanner;

public class strings {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            String fullName = firstName + " " + lastName;
            System.out.println(fullName);
        }
        String name = "Beniamine Nahid";
        // System.out.println(name.charAt(0));

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

    }
}
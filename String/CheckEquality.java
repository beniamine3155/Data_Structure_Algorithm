package String;

public class CheckEquality {
    public static void main(String[] args) {
        String s1 = "Nahid";
        String s2 = "Nahid";
        String s3 = new String("Nahid");

        if (s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (s1 == s3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (s1.equals(s3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

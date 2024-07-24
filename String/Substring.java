package String;

public class Substring {

    public static String getSubString(String str, int si, int ei) {
        String subString = "";
        for (int i = si; i < ei; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }

    public static void main(String[] args) {
        String str = "Beniamine Nahid";
        System.out.println(getSubString(str, 0, 9));

        System.out.println(str.substring(10, 15));
    }
}

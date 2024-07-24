package Time_Space_Complexity;

public class TimeSpaceComplexity {

    public static void main(String[] args) {

        // Simple loop
        for (int i = 0; i < args.length; i++) {
            // some constant work
        }
        // Time : O(n)

        // Nested loop
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {

            }
        }
        // Time: O(n2)

    }

}

package Binary_Trees;

public class DiameterApproach2 {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class Info {
        int height;
        int diameter;

        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info diameterOptimized(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameterOptimized(root.left);
        Info rightInfo = diameterOptimized(root.right);

        int diam = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
        int ht = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diam, ht);
    } // O(n)

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameterOptimized(root).diameter);
    }
}

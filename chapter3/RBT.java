package chapter3;

public class RBT <Key extends Comparable<Key>, Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    
    private class Node{
        Key key;
        Value val;
        Node left, rigth;
        int N;
        boolean color;

        public Node(Key key, Value val, int n, boolean color) {
            this.key = key;
            this.val = val;
            this.N = n;
            this.color = color;
        }
    }
    
    private  boolean isRed(Node x){
        if (x == null) return false;
        return x.color == RED;
    }
}

import java.util.*;
public class Diameterappriach2 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    static class Info{
        int diam;
        int ht;
        
        public Info(int diam, int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static  Info diamter2(Node root){//O(n)
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo = diamter2(root.left);
        Info rightInfo =diamter2(root.right);
        int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam, ht);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left =new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diamter2(root).diam);
    }
}
//output=5
//time complexity=O(n)

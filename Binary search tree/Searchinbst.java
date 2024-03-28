public class Searchinbst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }

    }
    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left, val);
        }
        if(root.data<val){
            //right subtree
            root.right=insert(root.right, val);
        }
        return root;

    }
    public static void main(String[] args) {
        int values[]={1,5,3,6,8,4,10,11,14};
        Node root=null;
        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }

        if(search(root, 13)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
}
//output=not found

public class Deleteinbst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    
    public static Node delete(Node root, int val){
        if(root==null){
            return null;
        }
        if(root.data>val){
            root.left=delete(root.left, val);
        }else if(root.data<val){
            root.right=delete(root.right, val);
        }else{//voila
            //case 1-leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2-single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //case 3- both childern
            Node IS=FindInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, val);
        }
        return root;
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
    public static void  inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node FindInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
 
   

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }
        System.out.println("before");
        inorder(root);
        System.out.println();
        
        root=delete(root, 14);
        System.out.println();
        inorder(root);
        

    }
}
//output before delete=1 3 4 5 6 8 10 11 14 

//after delete=1 3 4 5 6 8 10 11

public class Preorder {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static  Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root=tree.buildTree(nodes);

        tree.preorder(root);
    }
}
//output=4 5 2 6 3 1

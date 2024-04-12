public class Prefixtrie {
    static class Node{
        Node[] children = new Node[26];
        boolean eow=false;
        int freq;

        Node(){
            for(int i=0; i<children.length; i++){
                children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node();

    public static void insert(String word){//O(L)
        Node curr=root;
        for(int i=0; i<word.length(); i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else{
            curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static void findPrefix(Node root, String ans, String idx){//O(L)=l=level of trie
        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<root.children.length; i++){
            if(root.children[i]!=null){
                findPrefix(root.children[i], ans+(char)(i+'a'), idx+1);
            }
        }
    }
    public static void main(String[] args) {
        String arr[]={"zebra", "dog", "duck", "dove"};
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }

        root.freq=-1;
        findPrefix(root, " ", null);
    }
}
//output= dog
 //dov
// du
// z

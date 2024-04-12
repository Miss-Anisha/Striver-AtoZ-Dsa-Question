public class Longestwordtrie {
    static class Node{
        Node[] children = new Node[26];
        boolean eow;

        public Node(){
            for(int i=0; i<26; i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){//O(L)
        Node curr=root;
        for(int level=0; level<word.length(); level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static String ans=" ";
    public static void longestWord(Node root, StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0; i<26; i++){
            if(root.children[i]!=null&&root.children[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestWord(root.children[i], temp);
                //backtrack
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String words[]={"a","banana","app","apply","apple","ap","appl"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(" "));
        System.out.println(ans);
    }
}
//output=apple
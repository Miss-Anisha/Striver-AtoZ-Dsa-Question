public class Segmenttree {
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static int buildST(int arr[], int sti, int st, int end){
        if(st==end){
            tree[sti]=arr[st];
            return arr[st];
        }
        int mid=(st+end)/2;
        buildST(arr, 2*sti+1, st, mid);//left subtree
        buildST(arr, 2*sti+2, mid+1, end);//right subtree

        tree[sti]=tree[2*sti+1]+tree[2*sti+2];
        return tree[sti];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);

        for(int i=0; i<tree.length; i++){
            System.out.print(tree[i]+" ");
        }
    }
}
//output=36 10 26 3 7 11 15 1 2 3 4 5 6 7 8 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0

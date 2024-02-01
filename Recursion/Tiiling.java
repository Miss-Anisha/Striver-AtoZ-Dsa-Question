public class Tilingrecursion {
    public static int tilingRe(int n){
        if(n==0||n==1){
            return 1;
        }
        int ver=tilingRe(n-1);
        int hor=tilingRe(n-2);
        int totalways=ver+hor;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println((tilingRe(3)));
    }
}

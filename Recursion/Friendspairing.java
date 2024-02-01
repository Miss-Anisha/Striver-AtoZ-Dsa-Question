public class Friendspairing {
    public static int friendP(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1=friendP(n-1);
        int fnm2=friendP(n-2);
        int pairways=(n-1)*fnm2;
        int totalways=fnm1+pairways;
        return totalways;

        //or
        //return friendP(n-1) + (n-1)*friendP(n-2);
    }
    public static void main(String[] args) {
        System.out.println((friendP(3)));
    }
}
//output will be 4 

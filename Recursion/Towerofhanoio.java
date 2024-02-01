public class Towerofhanoio {
    public static void toh(int n, int A, int C, int B){
        if(n==0){
            return;
        }
        toh(n-1, A, B, C);
        System.out.println("moving" +n+ "th disk" +A+ "to" +C);
        toh(n-1, B, C, A);
    }
    public static void main(String[] args) {
        toh(3, 1, 3, 2);
    }
}
//output will be
//moving1th disk1to3
//moving2th disk1to2
//moving1th disk3to2
//moving3th disk1to3
//moving1th disk2to1
//moving2th disk2to3
//moving1th disk1to3

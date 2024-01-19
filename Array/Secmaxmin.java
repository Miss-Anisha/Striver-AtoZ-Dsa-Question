public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int[] result=new int[2];
        for(int i=0; i<n; i++){
            if(a[i]>max){
                secmax=max;
                max=a[i];
            }else if(a[i]>secmax && a[i]!=max){
                secmax=a[i];
            }
        }
        result[0]=secmax;

        int min=Integer.MAX_VALUE;
        int secmin=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(a[i]<min){
                secmin=min;
                min=a[i];
            }else if(a[i]<secmin && a[i]!=min){
                secmin=a[i];
            }
        }
        result[1]=secmin;
        return result;
    }
}

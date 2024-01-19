import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		Boolean same = true;
		Integer first = arr[0];
       	for (int i=1; i<arr.length; i++)
           if (arr[i] != first)
                same = false;


		for(int i=0; i<n; i++){
			if(arr[i]>max){
				secmax=max;
				max=arr[i];
			}else if(arr[i]>secmax && arr[i]!=max){
				secmax=arr[i];
			}
		}
		if(same) {
			return -1;
		}
		return secmax;
	}
}

import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
    long cur_sum = arr[0];
		long max_sum = 0;

		for(int i = 1; i < n; i++){
			cur_sum = cur_sum + arr[i];
			if(cur_sum > max_sum){
				max_sum = cur_sum;
			}
			if(cur_sum < 0){
				cur_sum = 0;
			}
		}

		return max_sum;
	}

}

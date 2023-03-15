package exerciseCodeIt;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int max=Integer.MIN_VALUE;
		int[] arr= {23,4,6,74,5,8,91};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}

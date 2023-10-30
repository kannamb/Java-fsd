package Assisted;

import java.util.Arrays;

public class FourthSmallestElement {
public static int KthSmallest(Integer[] arr,int k) {
		
		Arrays.sort(arr);
		//this will give you the smallest element
		return arr[k-1]; 
		
	}
	
	public static void main(String[] args) {
		
		Integer arr[]= new Integer[] {52,98,84,52,15,45,16};
		
		int k=4;
		
		System.out.println("Kth Smallest Element is : "+ KthSmallest(arr, k) );
	}


}

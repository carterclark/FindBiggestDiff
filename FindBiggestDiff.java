package misc;

import java.util.Scanner;

public class FindBiggestDiff {
	
	public static void minMax(int[] arr, int len) {		//method to print biggest difference of array
		int min,max;
		min=max=arr[0];
		
		
		for(int i=0; i<len; i++) {
			if(min > arr[i]) min = arr[i];
			if(max < arr[i]) max = arr[i];
		}
		
		System.out.println("Biggest difference in array is: " 
		+ (max - min));
		
	}

	public static void main(String[] args) {
		//Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = input.nextInt();
        
        int[] arr = new int[len];
        for(int i=0; i<len; i++) {
        	System.out.println("Enter next element: ");
        	arr[i] = input.nextInt();;
        }
        
       
        FindBiggestDiff.minMax(arr, len);
        
        
        
        
        
        
        
        
        
        input.close();

	}

}

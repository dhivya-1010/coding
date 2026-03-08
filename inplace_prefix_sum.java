//Q - > Implement Prefix Array by Given Array Itself || S.C=O(1)
//I/P : [3,1,2,4,5]
//O/P : [3,4,6,10,15]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("size if array A: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("enter n elements: ");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++){
		    arr[i] = arr[i-1]+arr[i];
		}
		System.out.println("Ans: " + Arrays.toString(arr));
	}
}

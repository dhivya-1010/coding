/*********************************************************************

Qus:
Range Sum Query
Problem Description

You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - index).
More formally, find A[L] + A[L + 1] + A[L + 2] + .... + A[R - 1] + A[R] for each query.

Problem Constraints

1 <= A.size() <= 10^4
1 <= A[i] <= 10^9

Input:
A = [3, 1, 2, 4, 5]

B = [[2,3],
     [1,4],
     [0,3]]

Output:
[6,12,10]

*********************************************************************/
//BRUTE FORCE:
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
		System.out.print("size if array B: ");
		int m = sc.nextInt();
		int[][] b = new int[m][2];
		System.out.print("enter m*2 elements: ");
		for(int i=0;i<m;i++){
		    for(int j=0;j<2;j++){
		        b[i][j] = sc.nextInt();
		    }
		}
		int[] res = new int[m];
		for(int i=0;i<m;i++){
		    int k = b[i][0];
		    int l = b[i][1];
		    int sum = 0;
		    for(int j=k;j<=l;j++){
		        sum+=arr[j];
		    }
		    res[i] = sum;
		    
		}
		System.out.println("Ans:"+ Arrays.toString(res));
        
	}
}


//OPTIMAL 
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
		System.out.print("size if array B: ");
		int m = sc.nextInt();
		int[][] b = new int[m][2];
		System.out.print("enter m*2 elements: ");
		for(int i=0;i<m;i++){
		    for(int j=0;j<2;j++){
		        b[i][j] = sc.nextInt();
		    }
		}
        int[] pf = new int[n];
        pf[0]=arr[0];
        int[] res = new int[m];
        for(int i=1;i<n;i++){
            pf[i] = pf[i-1]+arr[i];
        }
        for(int i=0;i<m;i++){
            int s = b[i][0];
            int e = b[i][1];
            if(s==0){
                res[i]=pf[e];
            }else{
            res[i] = pf[e]-pf[s-1];
            }
        }
        System.out.println("Ans:"+ Arrays.toString(res));
	}
}

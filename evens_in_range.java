/*********************************************************************

Even numbers in a range

Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

Each query consists of two integers B[i][0] and B[i][1].

For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].

Problem Constraints
1 <= N <= 10^5
1 <= Q <= 10^5
1 <= A[i] <= 10^9
0 <= B[i][0] <= B[i][1] < N

Input Format
First argument A is an array of integers.
Second argument B is a 2D array of integers.

*********************************************************************/
//BRUTE FORCE
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
		        if(arr[j]%2==0){
		            sum++;
		        }
		    }
		    res[i] = sum;
		    
		}
		System.out.println("Ans:"+ Arrays.toString(res));
        
	}
}

//OPTIMAL - PREFIX SUM 
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
		int c = 0;
		System.out.print("size if array B: ");
		int m = sc.nextInt();
		int[][] b = new int[m][2];
		System.out.print("enter m*2 elements: ");
		for(int i=0;i<m;i++){
		    for(int j=0;j<2;j++){
		        b[i][j] = sc.nextInt();
		    }
		}
		for(int i=0;i<n;i++){
		    if(arr[i]%2==0){
		        arr[i]=1;
		    }else{
		        arr[i]=0;
		    }
		}
		int[] pf = new int[n];
		pf[0]=arr[0];
		for(int i=1;i<n;i++){
		    pf[i]=pf[i-1]+arr[i];
		}
		int[] res = new int[m];
		for(int i=0;i<m;i++){
		    int s = b[i][0];
		    int e = b[i][1];
		  //  for(int j=s;j<=e;j++){
		        if(s==0) res[i]=pf[e];
		        else{
		            res[i]=pf[e]-pf[s-1];
		        }
		    //}
		    
		}
		System.out.println("Ans:"+ Arrays.toString(res));
        
	}
}


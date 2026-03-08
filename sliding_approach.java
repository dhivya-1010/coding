public class sliding_approach {
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;
        int n = arr.length;
        int max = 0;
        //int maximum=0;
        for(int i=0;i<k;i++){
            max+=arr[i];
        }
        int maximum = max;
        int window=max;
        for(int end = k;end<n;end++){
            window +=arr[end]-arr[end-k];
            maximum = Math.max(window,maximum);

        }
        System.out.println("maxi "+maximum);
        
    }
}

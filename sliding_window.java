public class sliding_window {
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        //int windowSum = 0;
        for(int i=0;i<=n-k;i++){
            int curr = 0;
            for(int j=i;j<i+k;j++){
                curr+=arr[j];
            }
            max = Math.max(max,curr);
        }
        // for (int end = k; end < arr.length; end++) {
        //     windowSum += arr[end] - arr[end - k];
        //     maxSum = Math.max(maxSum, windowSum);
        // }

        System.out.println("maxsum "+max);
    }
}

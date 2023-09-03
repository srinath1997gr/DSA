package GeeksforGeeks;

public class KadaneAlgo {

    public static void main(String[] args) {

    }

    long maxSubarraySum(int[] arr) {

        // Your code here
        int i = 0;
        int j = 1;
        long sum = 0;
        while (!(i == j)) {

            if (sum + arr[i] + arr[j] > sum) {
                j++;
                sum = sum +arr[j];
            }else{
                i++;
            }

        }

        return 0;
    }

}

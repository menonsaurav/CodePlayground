/*Given an array arr[] of size n-1 with integers in the range of [1, n], the task is to find the missing number from the first n integers.

Note: There are no duplicates in the list. */
class missingNumber1 {

    public static int missingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = 0;
        for(int i = 0 ; i < n - 1; ++i){
            sum += arr[i];
        }
        int expected_sum = (n * (n+1)) / 2;
        return expected_sum - sum;
    }
    public static void main(String[] args) {
        int[] arr
            = { 1, 2, 3, 5 };  
        int res = missingNumber(arr);
        System.out.println(res);  
    }
}

public class VariableSizeSlidingWindow {
    public static void main(String[] args) {

        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        int n = arr.length;
        int k = 5;
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;
        while (j < n) {
            sum = sum + arr[j];
            if (sum < k) {
                j++;
            }
            else if (sum == k) {
                count = Math.max(count, j - i + 1);
                j++;
            }
            else if (sum > k) {

                while (sum > k) {
                    sum = sum - arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(count);
    }
}
//ayush
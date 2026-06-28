import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr=merge(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] merge(int[] arr){
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;
        int [] left=merge(Arrays.copyOfRange(arr,0,mid));
        int [] right=merge(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
static int[] merge(int[] left, int[] right) {
    int[] mix = new int[left.length + right.length];

    int i = 0, j = 0, k = 0;

    while (i < left.length && j < right.length) {
        if (left[i] < right[j]) {
            mix[k++] = left[i++];
        } else {
            mix[k++] = right[j++];
        }
    }
    while (i < left.length) {
        mix[k++] = left[i++];
    }
    while (j < right.length) {
        mix[k++] = right[j++];
    }
    return mix;
}
}
import java.util.*;

public class Rotatearray {
    static void rev(int[] arr, int s, int end) {
        while (s < end) {
            int temp = arr[s];
            arr[s] = arr[end];
            arr[end] = temp;
            s++;
            end--;
        }
    }

    static void rotate(int[] arr, int rightrotate) {
        rightrotate = rightrotate % arr.length;

        rev(arr, 0, arr.length - 1);
        rev(arr, 0, rightrotate - 1);
        rev(arr, rightrotate, arr.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rightrotate = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr, rightrotate);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
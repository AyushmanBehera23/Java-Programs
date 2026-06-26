import java.util.Scanner;
public class zeroatend {
    static void zeros(int[] arr, int n) {
        int temp = 0;
            for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[temp] = arr[i];
                temp++;
            }
        }
while (temp < n) {
            arr[temp] = 0;
            temp++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        zeros(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
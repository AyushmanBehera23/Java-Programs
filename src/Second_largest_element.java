import java.util.*;
public class Second_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+ " ");
        }
//        Arrays.sort(arr);
//        int largest = arr[n - 1];
//        for(int i=n-2; i>=0; i--) {
//            if(arr[i] != largest)
//            System.out.println("Second largest element: " + arr[i]);
//            break;
//        }
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                seclargest = largest;
                largest = arr[i];
            } else if (arr[i] > seclargest && arr[i] != largest) {
                seclargest = arr[i];
            }
        }

        System.out.println("Second largest = " + seclargest);
    }
}

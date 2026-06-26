import java.util.*;
public class Search_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
                for(int i=0; i<n; i++) {
                    arr[i] = sc.nextInt();
                    System.out.print(arr[i]+ " ");
                }
                int find=sc.nextInt();
                for(int i=0;i<n;i++){
                    if(find==arr[i]) {
                        System.out.println(i);
                    }
                }
    }
}

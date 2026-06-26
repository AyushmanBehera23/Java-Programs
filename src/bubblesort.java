import java.util.Scanner;

public class bubblesort {
    static void bubble(int[] arr, int n){
        int temp =0;
        for (int i = 0; i < n; i++) {
            boolean swap=false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        bubble(arr,n);
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
}

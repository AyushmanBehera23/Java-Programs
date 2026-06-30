import java.util.Scanner;
import java.util.Arrays;
public class BinaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target=25;
        System.out.println(Arrays.toString(BinaryMatrix(matrix,target)));
    }
    static int[] BinaryMatrix(int arr[][],int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target)
                return new int[]{r,c};
            else if(arr[r][c]<target)
                r++;
            else
                c--;
        }
        return new int[]{-1,-1};
    }
}
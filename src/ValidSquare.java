import java.util.Scanner;

public class ValidSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean isValidSquare=false;
        for (int i = 0; i < n/2; i++) {
            if(i*i==n){
                isValidSquare=true;
                break;
            }
        }
        if(isValidSquare){
            System.out.println(n+" isperfect");
        }else{
            System.out.println("notperfect");
        }
    }
}

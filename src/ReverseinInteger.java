import java.util.*;
public class ReverseinInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int rev = 0;
        while(digit>0){
            int Temp=digit%10;
            rev = rev * 10 + Temp;
            digit = digit/10;
        }
        System.out.println(rev);
    }
}
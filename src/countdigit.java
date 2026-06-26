import java.util.*;
public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int count = 0;
        while(digit>0){
            digit=digit/10;
            count++;
        }
        System.out.println(count);
    }
}
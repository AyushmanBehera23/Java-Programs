import java.util.*;

public class NearestSmallerElement{

    public static ArrayList<Integer> Smallestonleft(ArrayList<Integer> arr, int n) {

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (stack.isEmpty()) {
                ans.add(-1);
            }

            else if (stack.peek() < arr.get(i)) {
                ans.add(stack.peek());
            }

            else {

                while (!stack.isEmpty() && stack.peek() >= arr.get(i)) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    ans.add(-1);
                } else {
                    ans.add(stack.peek());
                }
            }

            stack.push(arr.get(i));
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        ArrayList<Integer> ans = Smallestonleft(arr, n);

        for (int x : ans) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
//ayush
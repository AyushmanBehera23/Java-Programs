import java.util.*;
public class StockSpan {
        static ArrayList<Integer> calculateSpan(int[] arr) {

            Stack<int[]> st = new Stack<>();
            ArrayList<Integer> res = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {

                while (!st.isEmpty() && st.peek()[0] <= arr[i]) {
                    st.pop();
                }

                if (st.isEmpty()) {
                    res.add(i + 1);
                } else {
                    res.add(i - st.peek()[1]);
                }

                st.push(new int[]{arr[i], i});
            }

            return res;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            ArrayList<Integer> ans = calculateSpan(arr);

            for (int x : ans) {
                System.out.print(x + " ");
            }

            sc.close();
        }
    }

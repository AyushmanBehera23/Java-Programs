import java.util.*;

public class CountDistinctInWindow {

    static ArrayList<Integer> countDistinct(int arr[], int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans.add(map.size());
        for (int i = k; i < arr.length; i++) {
            int out = arr[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            ans.add(map.size());
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> result = countDistinct(arr, k);
        for (int x : result) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
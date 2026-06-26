public class seriesprint {
    static int series(int n){
        if(n<=1){
            return n;
        } else if (n>1) {
            for (int i = 0; i < n; i++) {
                System.out.println(n-i);
            }
        }
        return 0;
        }
    public static void main(String[] args) {
        int res=series(8);
    }
}

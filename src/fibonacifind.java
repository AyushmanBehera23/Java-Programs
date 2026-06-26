public class fibonacifind {
    public static void main(String[] args) {
        int res=fib(4);
        System.out.println(res);
    }
    static int fib(int n){
        if(n<2)
            return n;
        return fib(n-1)+fib(n-2);
    }
}

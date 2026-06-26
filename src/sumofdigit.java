public class sumofdigit {
    public static void main(String[] args) {
        int res=sof(555);
        System.out.println(res);
    }
    static int sof(int a){
        if(a==0){
            return a;
        }
        int rem = a % 10;
        return rem + sof(a / 10);
    }
}

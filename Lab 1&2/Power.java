
public class Power {
    static  int power(int N,int p){
    int pow = 1;
    for(int i = 1;i<=p;i++){
        pow*=N;
        
    }
    return pow;
}
    public static void main(String[] args) {
        int N = 2;
        int p= 2;
        System.out.println(power(N,p));
    }
}
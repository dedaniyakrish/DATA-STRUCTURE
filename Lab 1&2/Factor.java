import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc= new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println("Enter  of "+num+" are");
        for (int i= 1;i<=num;i++){
            if (num%i==0){
            System.out.println(i+" ");
            }
        }
    }
}

import java.util.Scanner;

public class FindOddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        if(number%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}

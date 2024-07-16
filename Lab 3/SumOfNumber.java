import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value of m");
        int m = scanner.nextInt();
        System.out.println("Enter a value of n");
        int n = scanner.nextInt();
         int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
    }
    System.out.println("The sum of a number is: "+sum);
}
}
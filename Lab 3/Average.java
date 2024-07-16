import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value of m");
        int m = scanner.nextInt();
        System.out.println("Enter a value of n");
        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;
        
        for (int i = m; i <= n; i++) {
            sum += i;
            count++;
        }
        
        double average = (double) sum / count;
        System.out.println("The average of the numbers from " + m + " to " + n + " is " + average);
    }
}

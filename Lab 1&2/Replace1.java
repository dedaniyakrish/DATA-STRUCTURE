import java.util.Scanner;

public class Replace1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of the array:");
        // int n = sc.nextInt();
        // int[] a = new int[n];
        int[] a = {1, 2, 3, 3, 4, 5, 6};
        int x = 3;
        int y = 6;

        for (int i = 0; i < a.length; i++) {  // Use < instead of <=
            if (a[i] == x || a[i] == y) {  // Correct the condition
                if (a[i] == x) {
                    a[i] = y;
                } else if (a[i] == y) {
                    a[i] = x;
                }
            }
        }

        // Print the final array
        System.out.print("Final array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}

import java.util.Scanner;


public class Arrray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of an array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i< size;i++){
            System.out.println("Enter element at index " + i);
            array[i] = scanner.nextInt();
        }
        for (int i = 0 ;i<size; i++){
            System.out.println("Element at index " + i + " is " + array[i]);
        }
}
}
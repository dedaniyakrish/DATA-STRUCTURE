import java.util.Scanner;
public class DeleteANumberInArrayAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            }
            System.out.println("Enter the number to be deleted: ");
            int num = scanner.nextInt();
            int[] array1 = new int[size-1];
            int j = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] != num) {
                    array1[j] = array[i];
                    j++;
                    }
                    }
                    System.out.println("Array after deletion: ");
                    for (int i = 0; i < size-1; i++) {
                        System.out.print(array1[i] + " ");
                        }
        }
    }

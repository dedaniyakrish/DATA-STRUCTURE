import java.util.Scanner;

class DeleteNumberOfGivenLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<size ;i++ ){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter a index to delete:");
        int index = scanner.nextInt();
        int [] newarray = new int[size-1];
        for(int i=0;i<index;i++){
            newarray[i]=array[i];
        }
        for(int i = index+1; i<array.length;i++){
            newarray[i-1] = array[i];
        }
        System.out.println("After delete a element new array is :");
        for(int i=0;i<newarray.length;i++){
            System.out.print(newarray[i] + " ");
        }
    }
}

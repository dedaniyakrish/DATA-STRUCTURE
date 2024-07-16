import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        System.out.println("ehter a charecter");
        Scanner sc = new Scanner(System.in);
        char charcter = sc.next().charAt(0);
        if(charcter == 'a' || charcter =='e' || charcter=='i' ||charcter=='o'|| charcter=='u' ){
        System.out.println("the Character is vowel ");
        }
        else{
            System.out.println("character is not vowel");
        }
    }
}

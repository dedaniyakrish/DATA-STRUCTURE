import java.util.Scanner;
class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter a radius:");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("the area of a cricle is : "+area);

    }
}
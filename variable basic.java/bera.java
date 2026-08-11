import java.util.Scanner;

public class bera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double a = 3.14159 * r * r;
        System.out.println("Area = " + a);
    }
}

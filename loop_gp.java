// ...existing code...
import java.util.Scanner;

public class loop_gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the number: ");
        
        int a = 1, r=2;
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a*=r;
        }
    }
}
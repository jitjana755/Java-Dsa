import java.util.Scanner;
public class compositenumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        for(int  i=2; i<n-1; i++){
            if(n%2 == 0){
                System.out.println("compositeve number");
            }
        }


    }
}
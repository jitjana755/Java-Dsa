import java.util.Scanner;
public class compositenumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        boolean flag = true;

        for(int  i=2;i<=Math.sqrt(n);i++){
            if(n%2 == 0){
                if(n%2 == 0){
                    flag = false;
                }
                
                break;
            }
        }
        if(n==1) System.out.println("neihter prime number");
        else if(flag==false) System.out.println("compositive number");
        else System.out.println("prime number");


    }
}
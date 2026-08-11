import java.util.Scanner;
public class for_loop{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:  ");

        int n = sc.nextInt();
        
        for(int i=2; i<=3*n-1;i++){
            System.out.println(i);
        }
    }
}
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=a%2;
        if(!(b==0)){   //not operator (!)
            System.out.println("It is even number");
        }
        else{
            System.out.println("It is odd number");
        }
    }
}

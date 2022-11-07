import java.util.Scanner;
public class and {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("age");
        int a=sc.nextInt();
        System.out.println("enter aaddad");
        int b=sc.nextInt();
        if(a>18 || b>18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("NOt eligible");
        }
    }
}

import java.util.Scanner;
public class voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int a=sc.nextInt();
        if(a<18){
            System.out.println("You are not eligible for voting");
        }
        if(a>18){
            System.out.println("Welcome to Voting system");
        }
    }
}

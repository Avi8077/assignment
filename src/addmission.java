import java.util.Scanner;
public class addmission {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your mark of english");
        int a=sc.nextInt();
        System.out.println("enter your marks of maths");
        int b=sc.nextInt();
        System.out.println("Enter your marks in Science");
        int c=sc.nextInt();
        int d=a+b+c;
        float e=d*0.33f;
        System.out.println("your percentage is"+' '+e+"%");

        if(e>60){
            System.out.println("Yes!! you are eligible");
        }
        else{
            System.out.println("Sorry, you are not eligible");
        }

    }
}
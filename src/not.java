import java.util.Objects;
import java.util.Scanner;
public class not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int a = sc.nextInt();
        if (a < 61 && a > 19) {
            System.out.println("You are eligible");
        } else {
            System.out.println("YOu are not eligible");
        }
    }
}

import java.util.Enumeration;
import java.util.Scanner;



public class homeWork5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число:");
        int num = scan.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;

    }

}

import java.util.Scanner;

import static java.lang.Math.abs;

public class nearToTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a");
        int a = scan.nextInt();
        System.out.println("enter b");
        int b = scan.nextInt();

        if (abs(a - 10) > abs(b - 10)) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }


    }
}

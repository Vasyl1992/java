import java.util.Scanner;

public class FibonaChi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть ціле число n");
        int num = scan.nextInt();
        int[] fib = new int[num];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < num; i++){

            System.out.println(fib[i]);
        }
    }
}
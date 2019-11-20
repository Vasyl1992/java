import java.util.Scanner;
public class homeWork4 {
    public static void main (String [] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введіть число");
        int a = sc.nextInt();

        if ( (a % 2)==0){
            System.out.println("Число є парним");
        }
        else {
            System.out.println("Число не парне");
        }

    }


}

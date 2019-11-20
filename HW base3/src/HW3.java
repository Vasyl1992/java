import java.util.Scanner;
public class HW3 {
    public static void main (String [] args){
        System.out.println("Write day of week");
        Scanner scan= new Scanner(System.in);
        String week = scan.nextLine();
        switch (week) {
            case "Monday": {
                System.out.println("go to the gym");
                System.out.println("take shower");
                System.out.println("do supper");
                break;

            }
            case "Tuesday": {
                System.out.println("go to the cinema");
                System.out.println("do homework");
                System.out.println("clean house");
                break;

            }
            case "Wendsday": {
                System.out.println("Buy products");
                System.out.println("wash the car");
                System.out.println("go to the gym");
                break;

            }
            case "Thursday": {
                System.out.println("go to logos academy");
                System.out.println("change oil in car");
                System.out.println("go for pizza ");
                break;

            }
            case "Friday": {
                System.out.println("Buy products");
                System.out.println("go to the gym");
                System.out.println("drink a lot of beer");
                break;

            }

            default:
                System.out.println("Check day of week");


        }
    }
}

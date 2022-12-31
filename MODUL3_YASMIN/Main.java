import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) throws Exception {
        Calculation z = new Calculation();
        Thread t1 = new Thread(z);
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        do {
            try{
                System.out.println("\n==MenuProgram==\n1. Square\n2. Circle\n3. Trapezoid\n0. Done");
                System.out.print("Select Menu: ");
                int menu = input.nextInt();
                switch(menu){
                    case 1:
                    System.out.print("Enter the length of the side of the square : ");
                    double side = input.nextDouble();
                    z.setSquare(side);
                    t1.start();
                    t1.join();
                    System.out.println("\nThe calculation result: " + z.getSquare());
                    break;

                    case 2:
                    System.out.print("Enter the radius of circle : ");
                    double radius = input.nextDouble();
                    z.setCircle(radius);
                    t1.start();
                    t1.join();
                    System.out.println("\nThe calculation result: " + z.getSquare());
                    break;

                    case 3:
                    System.out.print("Enter the side of the base of the trapezoid : ");
                    double a = input.nextDouble();
                    System.out.print("Enter the upper of the trapezoid : ");
                    double b = input.nextDouble();
                    System.out.print("Enter the height of the trapezoid : ");
                    double t = input.nextDouble();
                    z.setTrapezoid(a, b, t);
                    t1.start();
                    t1.join();
                    System.out.println("\nThe calculation result: " + z.getSquare());
                    break;

                    case 0:
                    repeat = false;
                    System.out.println("Thank you");
                    break;
                    default:
                    System.out.println("Options not available");
                    break;
                }    
            }
            catch(InputMismatchException e){
                System.out.println("===Error : Input must be a number!");
                input.nextLine();
                continue;
            }            
        } while (repeat);
        input.close();

    }
}

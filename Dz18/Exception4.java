package Dz18;
import java.util.Scanner;
public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("not int type");
        }finally {
            System.out.println("Finish");
        }
    }
}
class Tester4{
    public static void main(String[] args) {
        Exception4 ex4 = new Exception4();
        ex4.exceptionDemo();
    }
}
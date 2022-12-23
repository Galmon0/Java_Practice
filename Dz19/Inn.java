package Dz19;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Inn {
    public String num;

    public String getNum() {
        return num;
    }

    public void setNum() {
        if (num.length()!=12){
            try {
                throw new InnException("Inn is incorrect");
            } catch (InnException e) {
                System.err.println(e.getMessage());
            }
        }
        else{
            try {
                double num2 = Double.parseDouble(num);
                System.out.println("All right");
            }
            catch (NumberFormatException ex){
                try {
                    throw new InnException("Inn is incorrect");
                } catch (InnException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        this.num = num;
    }

    }
class Tester{
    public static void main(String[] args) {
        Inn inn = new Inn();
        String Fl;
        System.out.print("Enter an Full name ");
        Scanner myScanner = new Scanner(System.in);
        Fl = myScanner.next();
        System.out.print("Enter an integer ");
        inn.num = myScanner.next();
        inn.setNum();

    }
}

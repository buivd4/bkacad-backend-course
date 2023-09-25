/**
 * Lec10Example
 */
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lec10Example {
    static class NanException extends ArithmeticException{
        NanException(String msg){
            super(msg);
        }
    }
    static double calculate(double x, double y) throws NanException{
        double div=5*x-y;
        double divdr = 2*x + 7*y;
        if (divdr==0){
            throw new NanException("Mẫu số bằng 0");
        }
        return Math.sqrt(div/divdr);
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String selection;
        while (true){
            try{
                System.out.print("Nhập x: ");
                double x = scnr.nextDouble();
                System.out.print("Nhập y: ");
                double y = scnr.nextDouble();
                System.out.printf("Kết quả với x=%f và y=%f là: %f", x,y, calculate(x, y));
                System.out.print("Bạn có muốn tiếp tục không? C/K: ");
                selection = scnr.nextLine();
                if (selection != "C"){
                    break;
                }
            }
            catch (NanException e){
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException ie){
                System.out.print("Vui lòng nhập lại!");
                return;
            }

        }
        System.out.println(calculate(1, 1));
    }
}
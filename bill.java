import java.util.Scanner;

public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the price of the pen: \n");
        float pen = sc.nextFloat();
        System.out.println("Please enter the price of the pencil: \n");
        float pencil = sc.nextFloat();
        System.out.println("Please enter the price of the eraser: \n");
        float eraser = sc.nextFloat();
        float total = pen + pencil + eraser;
        float gst = 18/100f * total;
        float finalAmount = total + gst;
        System.out.println("Your total bill is: " + finalAmount);


    }
}

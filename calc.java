import java.util.*;

public class calc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        System.out.println("select the operation : \n . Enter 1 for addition \n . Enter 2 for subtraction \n . Enter 3 for multiplication \n . Enter 4 for division");

        int operation = sc.nextInt();
        switch (operation) {
            case 1: System.out.println("The sum is : " + (a + b));
                break;
                case 2: System.out.println("The difference is : " + (a - b));
                break;
                case 3: System.out.println("The product is : " + (a * b));
                break;
                case 4: System.out.println("The quotient is : " + (a / b));
                break;
                default: System.out.println("Invalid operation");
        }
    }
}

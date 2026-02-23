import java.util.*;

public class conditionalsque1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Your number is zero");
        
        } else if (num > 0) {
            System.out.println("Your number is positive");
        } else {
            System.out.println("Your number is negative");
        }
    }
}

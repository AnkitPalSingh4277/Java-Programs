import java.util.*;

public class numreverse {
    public static void main(String args[]) {
        System.out.println("Enter a number to reverse:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
    }
}

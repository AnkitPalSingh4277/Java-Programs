import java.util.*;

public class squarepattern {
    public static void main(String args[]) {
        System.out.println("Enter the number of rows and columns:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for(int j = 1; j <= n; j++) {
                System.out.print("*");

            }
        }
    }
}

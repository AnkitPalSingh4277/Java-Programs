import java.util.*;

public class circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = (float)(Math.PI * radius * radius);
        System.out.println(area);

    }
}

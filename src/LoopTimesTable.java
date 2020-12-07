
import java.util.Scanner;
public class LoopTimesTable {
    public static void main(String[] args) {

        int a, b;
        System.out.println("Enter the number to print times table");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();  // Scanner itself is as String input but here needs an integer input

        for(b = 1; b<=10; b++) {
            System.out.println(a + "*" + b + "=" + (a * b));
        }
    }
}

public class Loop<i> {
    public static void main(String args[]) {

        for (int x = 1; x <= 10; x++) {
            System.out.println(2 % 2);
            if (x % 2 == 0) {
                System.out.println(x);
            } else {
                System.out.println(x + " is odd");
            }
        }
    }
}
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Whar's your age? ");

        age= input.nextInt();

        if(age>=18) {
            System.out.println("You are an adult.");
        }
        else if(age>=0) {
            System.out.println("You are a kid.");
        }
        else {
            System.out.println("You entered wrong age.");
        }
    }
}

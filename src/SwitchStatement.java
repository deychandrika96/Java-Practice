import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your score");

        int grade;
        grade = (int) input.nextDouble();
        if(grade > 90) {
            System.out.println("Not a valid score");
        } else {

            switch(grade / 10) {
                case 10:
                case 9:

                    /*score between 80-90*/
                    System.out.println("You got A+. You passed");
                    break;
                case 8:
                case 7:

                    //score between 75-80
                    System.out.println("You got A. You passed");
                    break;
                case 6:

                    //score between 65-75
                    System.out.println("You got B ");
                    break;
                case 5:

                    //score between 45-65
                    System.out.println("You Passed with bad grade");

            }
        }
    }
}

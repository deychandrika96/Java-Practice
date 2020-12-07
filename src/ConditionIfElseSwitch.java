public class ConditionIfElseSwitch {
    public static void main(String args[]) {

        /* Syntax
        following are the syntax

        if(Boolean_Expression 1) {
           //Executes when the Boolean expression 1 is true
        }else if(Boolean_expression 2) }
          //Executes when the Boolean expression 2 is true
        }else if(Boolean_expression 3) }
          //Executes when the Boolean expression 3 is true
        }else {
          //Executes when the none of the above condition is true.
          }
    */
        System.out.println("She said \"Hello!\" to me. ");
        System.out.println("He said  'Hi!' \n to her also.");
        int adult = 18;
        int age = -18;

        //If you are more or equal to 18 and less than equal to 120 => You are an adult
        if(age >= adult && age <= 120){
            System.out.println("You are an adult");
        }

        //If you are less than 0 => wait for your turn
            else if(age < 0){
                System.out.println("Wait for your turn");
            }
            //If you are more than 120 => RIP
        else if(age > 120){
            if(age > 121 && age < 199) {
                System.out.println("Enjoy it till it ends");
            }else{
                System.out.println("RIP");
            }
        }
        else{
            System.out.println("You are a kid");
        }
    }
}

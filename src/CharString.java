import java.util.Locale;

public class CharString {
    public static void main(String args[]) {

//...
        char letter = 'a';
        char letterTwo = 'S';

        System.out.println(Character.toUpperCase(letter));
        //System.out.println( letter + " to upper case " + Character.toUpperCase(letter));
        System.out.println(Character.toLowerCase(letterTwo));
        //System.out.println( letterTwo + " to lower case " + Character.toLowerCase(letterTwo));

        String name = "Chandrika";
        System.out.println("My name is " + name);
        System.out.println("====");

        //convert Char array to String
        char[] company = {'D', 'E', 'Y'};
        //Enhance loop
        for(char x : company){
            System.out.println(x);
        }

        //convert char array to string
        String convertedString = new String(company);
        System.out.println(convertedString);

        //String method
        System.out.println("The length of this " + name +  " is " + name.length());

        String firstName = "Chandrika";
        String lastName = "Dey";

        //convert
        System.out.println("This is without concat method " + firstName + lastName);
        System.out.println("This is with concat method " + firstName + lastName);

        //Returns Boolean
        String subject = "English";
        String subjectTwo = "Science";
        String subjectThree = "English";
        System.out.println("Is " + subject + " equal to " + subjectTwo + " : " + subject.equals(subjectThree));

        //SubString
        //E n g l i s h
        //0 1 2 3 4 5 6
        String giantString = "asdfhvkjlnknmbncfcnh";
        //Print from 3rd character to end
        //English
        //Length starts from 1 but Index starts from 0
        //3 to 7 - 1
        //7, 20-1
        System.out.println("The length of this String " + giantString + " is " + giantString.length());
        System.out.println("Print first three character of " + giantString + " is " + giantString.substring(7, (giantString.length() - 1)));

    }

    String company1 = "Chase";
    //Split the each letter



}

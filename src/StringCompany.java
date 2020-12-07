public class StringCompany {
    public static void main(String[] args) {

        String company = "Chase";

        int length = company.length(); // gives the number of strings
        System.out.println(length);

        int i;
        for (i = 0; i < company.length(); i++) {

            char letter = company.charAt(i);
            System.out.println(letter);

        }
    }
}

import java.util.Scanner;

public class Exercise1 {
    public static boolean textIncludingCheck(String textOne, String textTwo) {
        boolean textIsIncluded = false;
        int counter = 0;
        for (int i = 0; i < textOne.length(); i++) {
                if (textOne.charAt(i) == textTwo.charAt(counter)) {
                    if (counter + 1 == textTwo.length()){
                        textIsIncluded = true;
                        break;
                    } else {
                        counter++;
                    }
                } else {
                    counter = 0;
                }
            }
        return textIsIncluded;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first text: ");
        String textOne = scanner.nextLine();
        System.out.println("Please enter the second text: ");
        String textTwo = scanner.nextLine();
        boolean textIncluded = textIncludingCheck(textOne, textTwo);
        System.out.println(textIncluded);
    }
}

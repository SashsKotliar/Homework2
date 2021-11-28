import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phone number: ");
        String phoneNumber = scanner.nextLine();
        String thePhoneIs = phoneNumberCheck(phoneNumber);
        System.out.println(thePhoneIs);
    }

    public static String phoneNumberCheck(String phoneNumber){
        String invalidNumber = " ";
        String zeroFive = "05";
        String dash = "-";
        String theEnteredPhone;
        if (phoneNumber.length() > 12 || phoneNumber.length() < 10) {
            theEnteredPhone = invalidNumber;
        } else if (phoneNumber.charAt(0) == '9' && phoneNumber.length() == 12){
            theEnteredPhone = zeroFive + phoneNumber.charAt(4) + dash + phoneNumber.charAt(5) + phoneNumber.charAt(6) + phoneNumber.charAt(7) + phoneNumber.charAt(8) + phoneNumber.charAt(9) + phoneNumber.charAt(10) + phoneNumber.charAt(11);
            } else if (phoneNumber.charAt(0) == '0' && phoneNumber.length() == 10){
           theEnteredPhone = zeroFive + phoneNumber.charAt(2) + dash + phoneNumber.charAt(3) + phoneNumber.charAt(4) + phoneNumber.charAt(5) + phoneNumber.charAt(6) + phoneNumber.charAt(7) + phoneNumber.charAt(8) + phoneNumber.charAt(9);
        } else if (phoneNumber.charAt(0) == '0' && phoneNumber.length() == 11){
            theEnteredPhone = phoneNumber;
        } else {
            theEnteredPhone = invalidNumber;
        }
        return theEnteredPhone;
    }
}

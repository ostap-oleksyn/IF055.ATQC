package oarabtc.regexp;

import java.util.ArrayList;
import java.util.regex.*;

public class PhoneNumCheck {

    public static void main(String[] args) {

        ArrayList<String> phoneNumbers = new ArrayList<String>() {{
            add("(123) 456 7899");
            add("(123).456.7899");
            add("(123)-456-7899");
            add("123-456-7899");
            add("123 456 7899");
            add("1234567899");
            add("phoneNumber");
            add("0502610717");
            add("(0342)787878");
            add("(067))346721");
            add("050)9999888");
            add("re098call");
        }};

        phoneNumbers.forEach
                (phoneNum -> System.out.println("Number: " + phoneNum + " - is " + isPhoneNumberValid(phoneNum)));
    }

    public static boolean isPhoneNumberValid(String phoneNumber) {
        Pattern numberPattern = Pattern.compile("((\\(\\d{3}\\))|(\\d{3}))[\\s|.|-]?\\d{3}[\\s|.|-]?\\d{4}");
        Matcher numberMatcher = numberPattern.matcher(phoneNumber);
        return numberMatcher.matches();
    }
}

package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

    /*
     * Purpose: Boolean method to validate first name. Condition for regex is, name
     * should start with capital letter and name should have minimum 3 letters.
     *
     * @param firstName: First name to validate.
     */
    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        // Returns false if user does not enter any name.
        if (firstName.isEmpty())
            return false;

        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();

    }

    /*
     * Purpose: Boolean method to validate first name. Condition for regex is, name
     * should start with capital letter and name should have minimum 3 letters.
     */
    public void validateUserDetails(){
        Scanner sc = new Scanner(System.in);
        userRegistrationDetail userDetails = new userRegistrationDetail();
        userRegistration userRegistration = new userRegistration();

        System.out.println("Enter your first name");
        userDetails.setFirstName(sc.next());

        boolean flag = userRegistration.validateFirstName(userDetails.getFirstName());
        if (flag == true)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
        sc.close();
    }
}
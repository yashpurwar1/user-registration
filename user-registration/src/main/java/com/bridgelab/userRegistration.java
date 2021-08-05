package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

    /*
     * Purpose: Boolean method to validate first and last name.
     * Condition for regex is, first name and last name should start
     * with capital letter and name should have minimum 3 letters.
     *
     * @param name: First and last name to validate.
     */
    public boolean validateName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        // Returns false if user does not enter any name.
        if (name.isEmpty())
            return false;

        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }

    /*
     * Purpose: Boolean method to validate first and last name. Condition for regex is, name
     * should start with capital letter and name should have minimum 3 letters.
     */
    public void validateUserDetails() {
        Scanner sc = new Scanner(System.in);
        userRegistrationDetail userDetails = new userRegistrationDetail();
        userRegistration userRegistration = new userRegistration();

        // validating first name.
        System.out.println("Enter your first name");
        userDetails.setFirstName(sc.next());
        boolean fName = userRegistration.validateName(userDetails.getFirstName());
        if (fName)
            System.out.println("First name is valid");
        else
            System.out.println("First name is invalid");

        // validating last name.
        System.out.println("Enter your last name");
        userDetails.setLastName(sc.next());

        boolean lName = userRegistration.validateName(userDetails.getLastName());
        if (lName)
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is invalid");
        sc.close();
    }
}
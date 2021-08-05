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
     * Purpose: Boolean method to validate mail ID of user.
     *
     * @param mail: mail to validate.
     */
    public boolean validateEmail(String mail) {
        String regex = "^([a-zA-z0-9-_+\\.]+)@([a-z0-9-]+)\\.([a-z,]{2,4})((\\.[a-z]{2,4})?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }

    /*
     * Purpose: Boolean method to validate first name,last name and mail ID of user.
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

        // validating Email.
        System.out.println("Enter your mail");
        userDetails.setMail(sc.next());

        boolean mail = userRegistration.validateEmail(userDetails.getMail());
        if (mail)
            System.out.println("Entered mail is valid");
        else
            System.out.println("Entered mail is invalid");
        sc.close();
    }
}
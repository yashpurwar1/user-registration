package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    userRegistration validator = new userRegistration();

    // Test cases to validate First Name.
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(validator.validateName("Yash"));
    }

    @Test
    public void givenFirstName_WhenStartingNotCapital_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateName("yash"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateName("ya"));
    }

    @Test
    public void givenFirstName_WithNumberOrSpecialChar_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateName("@yash"));
    }

    // Test cases for last name.
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(validator.validateName("Purwar"));
    }

    @Test
    public void givenLastName_WhenStartingNotCapital_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateName("purwar"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateName("Pu"));
    }

    @Test
    public void givenLastName_WithNumberOrSpecialChar_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateName("PU@r"));
    }

    // Test cases to validate email.

    @Test
    public void givenMail_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(validator.validateEmail("abc@yahoo.com"));
    }

    @Test
    public void givenMail_WithoutAtTheRate_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateEmail("abc.com"));
    }

    @Test
    public void givenMail_WithoutUserName_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateEmail("@gmail.com"));
    }

    @Test
    public void givenMail_WithoutDomainName_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateEmail("abc@.com"));
    }

    @Test
    public void givenMail_WithoutMainTld_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateEmail("abc@gmail"));
    }

    @Test
    public void givenMail_WithOptionalTld_ShouldReturnTrue() {
        Assert.assertTrue(validator.validateEmail("abc@yahoo.co.in"));
    }

    @Test
    public void givenMail_WithOptionalUserName_ShouldReturnTrue() {
        Assert.assertTrue(validator.validateEmail("abc+100@yahoo.co.in"));
    }

    // Test cases to validate Mobile number.


    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(validator.validateMobileNumber("919686762778"));
    }



    @Test
    public void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateMobileNumber("9686762778"));
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(validator.validateMobileNumber("919686762"));
    }

    // Test Cases to validate Password.
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        Assert.assertTrue(validator.validatePassword("Abc$def18"));
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse() {
        Assert.assertFalse(validator.validatePassword("Abc$11"));
    }

    @Test
    public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
        Assert.assertFalse(validator.validatePassword("abc$defg18"));
    }

    @Test
    public void givenPassword_WhenNoNumber_ShouldReturnFalse() {
        Assert.assertFalse(validator.validatePassword("Abc$de"));
    }

    @Test
    public void givenPassword_With2SpecialChar_ShouldReturnFalse() {
        Assert.assertFalse(validator.validatePassword("Abc$$defr1"));
    }
}
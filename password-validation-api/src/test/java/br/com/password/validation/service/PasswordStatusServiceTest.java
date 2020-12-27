package br.com.password.validation.service;

import org.junit.Assert;
import org.junit.Test;

public class PasswordStatusServiceTest {

    PasswordStatusService passwordStatusService;

    @Test
    public void caseMinSizeFalse() {

        passwordStatusService = new PasswordStatusService("^1qAd");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    @Test
    public void caseSpaceFalse() {

        passwordStatusService = new PasswordStatusService("   12qwa31@!@QQAA");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    @Test
    public void caseSpecialFalse() {

        passwordStatusService = new PasswordStatusService("ASDSwewwew12112");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    @Test
    public void caseNumericFalse() {

        passwordStatusService = new PasswordStatusService("!@AASASADddddddaswee");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    @Test
    public void caseLetterFalse() {

        passwordStatusService = new PasswordStatusService("!@AASASAD12121212211");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    @Test
    public void caseUpperFalse() {

        passwordStatusService = new PasswordStatusService("%121221aaaaaaaaa3232");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    @Test
    public void caseLowerFalse() {

        passwordStatusService = new PasswordStatusService("-3232AAAAAAAAAA@#@@!#3");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    @Test
    public void caseNoRepeatFalse() {

        passwordStatusService = new PasswordStatusService(")(12aqwdc|Vazc");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    @Test
    public void casePasswordValid() {

        passwordStatusService = new PasswordStatusService(")123456OIHVCsgvb");
        Assert.assertTrue(passwordStatusService.PasswordValidation());

    }

}

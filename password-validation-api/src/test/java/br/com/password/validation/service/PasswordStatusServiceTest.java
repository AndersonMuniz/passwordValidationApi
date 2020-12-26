package br.com.password.validation.service;

import org.junit.Assert;

public class PasswordStatusServiceTest {

    public void caseMinSizeFalse() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("^1qAd");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    public void caseMinSizeTrue() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("^1qAd12s3q1221dsq321");
        Assert.assertTrue(passwordStatusService.PasswordValidation());

    }

    public void caseSpaceFalse() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("   12qwa31@!@QQAA");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    public void caseSpaceTrue() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("AAAAAAAAAAAAAAAAAAA");
        Assert.assertTrue(passwordStatusService.PasswordValidation());

    }

    public void caseSpecialFalse() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("ASDSwewwew12112");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    public void caseSpecialTrue() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("(fxssWAEDDS123$122");
        Assert.assertTrue(passwordStatusService.PasswordValidation());

    }

    public void caseNumericFalse() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("!@AASASADddddddaswee");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    public void caseNumericTrue() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("#fxssWAEDDS123122");
        Assert.assertTrue(passwordStatusService.PasswordValidation());

    }

    public void caseLetterFalse() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("!@AASASAD12121212211");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    public void caseLetterTrue() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("^c12sr5AS3fds4fdd");
        Assert.assertTrue(passwordStatusService.PasswordValidation());

    }

    public void caseUpperFalse() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("%121221aaaaaaaaa3232");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    public void caseUpperTrue() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("&1211aaaa@EWAASAaS");
        Assert.assertTrue(passwordStatusService.PasswordValidation());

    }

    public void caseLowerFalse() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("-3232AAAAAAAAAA@#@@!#3");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    public void caseLowerTrue() {

        PasswordStatusService passwordStatusService = new PasswordStatusService("+1121322BBXFDSSpouyt");
        Assert.assertTrue(passwordStatusService.PasswordValidation());

    }

    public void caseNoRepeatFalse() {

        PasswordStatusService passwordStatusService = new PasswordStatusService(")(12aqwdc|Vazc");
        Assert.assertFalse(passwordStatusService.PasswordValidation());

    }

    public void caseNoRepeatTrue() {

        PasswordStatusService passwordStatusService = new PasswordStatusService(")123456OIHVCsgvbg");
        Assert.assertTrue(passwordStatusService.PasswordValidation());

    }

}

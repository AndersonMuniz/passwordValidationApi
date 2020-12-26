package br.com.password.validation.service;

import org.junit.Assert;

public class WordValidationServiceTest {

    public void caseMinSizeFalse() {

        WordValidationService wordValidationService = new WordValidationService("!Qas23");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    public void caseMinSizeTrue() {

        WordValidationService wordValidationService = new WordValidationService("123456789");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

    public void caseNoSpaceCharFalse() {

        WordValidationService wordValidationService = new WordValidationService("AbC) 1");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    public void caseNoSpaceCharTrue() {

        WordValidationService wordValidationService = new WordValidationService("AbC)C1");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

    public void caseSpecialCharFalse() {

        WordValidationService wordValidationService = new WordValidationService("AbC1123342");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    public void caseSpecialCharTrue() {

        WordValidationService wordValidationService = new WordValidationService("AbC)C1 ");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

    public void caseIsNumericFalse() {

        WordValidationService wordValidationService = new WordValidationService("Aaav@#AQEWCXasc");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    public void caseIsNumericTrue() {

        WordValidationService wordValidationService = new WordValidationService("Aaav@#AQEWCXasc1 ");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

    public void caseIsLetterFalse() {

        WordValidationService wordValidationService = new WordValidationService("12345678981125");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    public void caseIsLetterTrue() {

        WordValidationService wordValidationService = new WordValidationService("YYYYYYYYYYYYYYYY");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

    public void caseUpperCaseFalse() {

        WordValidationService wordValidationService = new WordValidationService("1234aaaaaaa!@#@@");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    public void caseUpperCaseTrue() {

        WordValidationService wordValidationService = new WordValidationService("!123aaaadw44eX");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

    public void caseLowerCaseFalse() {

        WordValidationService wordValidationService = new WordValidationService("1234!@#@@");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    public void caseLowerCaseTrue() {

        WordValidationService wordValidationService = new WordValidationService("!@WQASDascA");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

    public void caseNoEqualCharFalse() {

        WordValidationService wordValidationService = new WordValidationService("asfvcgysr45v");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    public void caseNoEqualCharTrue() {

        WordValidationService wordValidationService = new WordValidationService("12qdsfe566");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

}

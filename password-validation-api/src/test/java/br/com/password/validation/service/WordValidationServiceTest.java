package br.com.password.validation.service;

import org.junit.Assert;
import org.junit.Test;

public class WordValidationServiceTest {

    @Test
    public void caseMinSizeFalse() {

        WordValidationService wordValidationService = new WordValidationService("!Qas23");
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    @Test
    public void caseMinSizeTrue() {

        WordValidationService wordValidationService = new WordValidationService("123456789");
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

    @Test
    public void caseNoSpaceCharFalse() {

        WordValidationService wordValidationService = new WordValidationService("AbC) 1");
        Assert.assertFalse(wordValidationService.NoSpaceChar());

    }

    @Test
    public void caseNoSpaceCharTrue() {

        WordValidationService wordValidationService = new WordValidationService("AbC)C1");
        Assert.assertTrue(wordValidationService.NoSpaceChar());

    }

    @Test
    public void caseSpecialCharFalse() {

        WordValidationService wordValidationService = new WordValidationService("AbC1123342");
        Assert.assertFalse(wordValidationService.SpecialChar());

    }

    @Test
    public void caseSpecialCharTrue() {

        WordValidationService wordValidationService = new WordValidationService("AbC)C1 ");
        Assert.assertTrue(wordValidationService.SpecialChar());

    }

    @Test
    public void caseIsNumericFalse() {

        WordValidationService wordValidationService = new WordValidationService("Aaav@#AQEWCXasc");
        Assert.assertFalse(wordValidationService.IsNumeric());

    }

    @Test
    public void caseIsNumericTrue() {

        WordValidationService wordValidationService = new WordValidationService("Aaav@#AQEWCXasc1 ");
        Assert.assertTrue(wordValidationService.IsNumeric());

    }

    @Test
    public void caseIsLetterFalse() {

        WordValidationService wordValidationService = new WordValidationService("12345678981125");
        Assert.assertFalse(wordValidationService.IsLetter());

    }

    @Test
    public void caseIsLetterTrue() {

        WordValidationService wordValidationService = new WordValidationService("YYYYYYYYYYYYYYYY");
        Assert.assertTrue(wordValidationService.IsLetter());

    }

    @Test
    public void caseUpperCaseFalse() {

        WordValidationService wordValidationService = new WordValidationService("1234aaaaaaa!@#@@");
        Assert.assertFalse(wordValidationService.UpperCase());

    }

    @Test
    public void caseUpperCaseTrue() {

        WordValidationService wordValidationService = new WordValidationService("!123aaaadw44eX");
        Assert.assertTrue(wordValidationService.UpperCase());

    }

    @Test
    public void caseLowerCaseFalse() {

        WordValidationService wordValidationService = new WordValidationService("1234!@#@@");
        Assert.assertFalse(wordValidationService.LowerCase());

    }

    @Test
    public void caseLowerCaseTrue() {

        WordValidationService wordValidationService = new WordValidationService("!@WQASDascA");
        Assert.assertTrue(wordValidationService.LowerCase());

    }

    @Test
    public void caseNoEqualCharFalse() {

        WordValidationService wordValidationService = new WordValidationService("asfvcgysr45v");
        Assert.assertFalse(wordValidationService.NoEqualChar());

    }

    @Test
    public void caseNoEqualCharTrue() {

        WordValidationService wordValidationService = new WordValidationService("12qdsfe566");
        Assert.assertTrue(wordValidationService.NoSpaceChar());

    }

}

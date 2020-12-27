package br.com.password.validation.service;

import org.junit.Assert;
import org.junit.Test;

public class WordValidationServiceTest {

    @Test
    public void caseMinSizeFalse() {

        WordValidationService wordValidationService = new WordValidationService("!Qas23");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.ValidationSizeMin());

    }

    @Test
    public void caseMinSizeTrue() {

        WordValidationService wordValidationService = new WordValidationService("123456789");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.ValidationSizeMin());

    }

    @Test
    public void caseNoSpaceCharFalse() {

        WordValidationService wordValidationService = new WordValidationService("AbC) 1");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.NoSpaceChar());

    }

    @Test
    public void caseNoSpaceCharTrue() {

        WordValidationService wordValidationService = new WordValidationService("AbC)C1");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.NoSpaceChar());

    }

    @Test
    public void caseSpecialCharFalse() {

        WordValidationService wordValidationService = new WordValidationService("AbC1123342");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.SpecialChar());

    }

    @Test
    public void caseSpecialCharTrue() {

        WordValidationService wordValidationService = new WordValidationService("AbC)C1 ");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.SpecialChar());

    }

    @Test
    public void caseIsNumericFalse() {

        WordValidationService wordValidationService = new WordValidationService("Aaav@#AQEWCXasc");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.isNumeric());

    }

    @Test
    public void caseIsNumericTrue() {

        WordValidationService wordValidationService = new WordValidationService("Aaav@#AQEWCXasc1 ");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.isNumeric());

    }

    @Test
    public void caseIsLetterFalse() {

        WordValidationService wordValidationService = new WordValidationService("12345678981125");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.isLetter());

    }

    @Test
    public void caseIsLetterTrue() {

        WordValidationService wordValidationService = new WordValidationService("YYYYYYYYYYYYYYYY");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.isLetter());

    }

    @Test
    public void caseUpperCaseFalse() {

        WordValidationService wordValidationService = new WordValidationService("1234aaaaaaa!@#@@");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.UpperCase());

    }

    @Test
    public void caseUpperCaseTrue() {

        WordValidationService wordValidationService = new WordValidationService("!123aaaadw44eX");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.UpperCase());

    }

    @Test
    public void caseLowerCaseFalse() {

        WordValidationService wordValidationService = new WordValidationService("1234!@#@@");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.LowerCase());

    }

    @Test
    public void caseLowerCaseTrue() {

        WordValidationService wordValidationService = new WordValidationService("!@WQASDascA");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.LowerCase());

    }

    @Test
    public void caseNoEqualCharFalse() {

        WordValidationService wordValidationService = new WordValidationService("asfvcgysr45v");
        wordValidationService.AddList();
        Assert.assertFalse(wordValidationService.NoEqualChar());

    }

    @Test
    public void caseNoEqualCharTrue() {

        WordValidationService wordValidationService = new WordValidationService("12qdsfe566");
        wordValidationService.AddList();
        Assert.assertTrue(wordValidationService.NoSpaceChar());

    }

}

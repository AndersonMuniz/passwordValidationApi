package br.com.password.validation.service;

import org.junit.Assert;
import org.junit.Test;

public class LetterValidationServiceTest {

    @Test
    public void casefalse1() {

        LetterValidationService letterValidationService = new LetterValidationService("");
        Assert.assertFalse(letterValidationService.LetterValidationFind());

    }

    @Test
    public void casefalse2() {

        LetterValidationService letterValidationService = new LetterValidationService("aa");
        Assert.assertFalse(letterValidationService.LetterValidationFind());

    }

    @Test
    public void casefalse3() {

        LetterValidationService letterValidationService = new LetterValidationService("ab");
        Assert.assertFalse(letterValidationService.LetterValidationFind());

    }

    @Test
    public void casefalse4() {

        LetterValidationService letterValidationService = new LetterValidationService("AAAbbbCc");
        Assert.assertFalse(letterValidationService.LetterValidationFind());

    }

    @Test
    public void casefalse5() {

        LetterValidationService letterValidationService = new LetterValidationService("AbTp9!foo");
        Assert.assertFalse(letterValidationService.LetterValidationFind());

    }

    @Test
    public void casefalse6() {

        LetterValidationService letterValidationService = new LetterValidationService("AbTp9!foA");
        Assert.assertFalse(letterValidationService.LetterValidationFind());

    }

    @Test
    public void casefalse7() {

        LetterValidationService letterValidationService = new LetterValidationService("AbTp9 fok");
        Assert.assertFalse(letterValidationService.LetterValidationFind());

    }

}

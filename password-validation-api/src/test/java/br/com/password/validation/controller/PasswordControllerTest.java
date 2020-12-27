package br.com.password.validation.controller;

import org.junit.Assert;
import org.junit.Test;

public class PasswordControllerTest {

    @Test
    public void validPasswordFalse() {

        PasswordController controller = new PasswordController();
        Assert.assertFalse(controller.checkPassword("!@@#dsaQWF34678"));

    }
    @Test
    public void validPasswordTrue() {

        PasswordController controller = new PasswordController();
        Assert.assertTrue(controller.checkPassword("AbTp9!fok"));

    }

}

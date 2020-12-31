package br.com.password.validation.controller;

import br.com.password.validation.VO.ReturnStatusPasswordVO;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.http.ResponseEntity;

public class PasswordControllerTest {
    ResponseEntity<ReturnStatusPasswordVO> returStatus;

    @Test
    public void validPasswordFalse() {

        PasswordController passwordController = new PasswordController();
        returStatus = passwordController.checkPassword("12123qA");

        Assert.assertFalse(returStatus.getBody().isStatusPassword());
    }

    @Test
    public void validPasswordTrue() {

        PasswordController passwordController = new PasswordController();
        returStatus = passwordController.checkPassword("@Anderson07");

        Assert.assertFalse(returStatus.getBody().isStatusPassword());
    }

}

package br.com.password.validation.VO;

import org.junit.Assert;
import org.junit.Test;

public class ReturnStatusPasswordVOTest {

    @Test
    public void returnStatusPasswordVOFalse() {

        ReturnStatusPasswordVO returnStatusPasswordVO = new ReturnStatusPasswordVO("qwsaas12q");
        Assert.assertFalse(returnStatusPasswordVO.isStatusPassword());

    }

    @Test
    public void returnStatusPasswordVOTrue() {

        ReturnStatusPasswordVO returnStatusPasswordVO = new ReturnStatusPasswordVO("!as$#EFdt645fp");
        Assert.assertTrue(returnStatusPasswordVO.isStatusPassword());

    }
}

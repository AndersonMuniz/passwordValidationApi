package br.com.password.validation.VO;

import br.com.password.validation.service.PasswordStatusService;

public class ReturnStatusPasswordVO {

    private String password;
    private boolean statusPassword;

    public ReturnStatusPasswordVO(String password) {
        this.password = password;
    }

    public boolean isStatusPassword() {

        PasswordStatusService passwordStatusService = new PasswordStatusService(password);
        statusPassword = passwordStatusService.PasswordValidation();

        return statusPassword;
    }

}

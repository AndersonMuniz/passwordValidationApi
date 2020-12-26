package br.com.password.validation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.password.validation.service.PasswordStatusService;

@RestController
public class PasswordController {
	private static final Logger LOG = LoggerFactory.getLogger(PasswordController.class);

    @GetMapping(path = "/")
    public boolean checkPassword (@RequestParam (value = "password") String password) {

        boolean validationReturn;

        LOG.debug("Inicio do método checkPassword");
        LOG.info("Senha recebida : {}" , password);

        PasswordStatusService passwordStatusService = new PasswordStatusService(password);

        validationReturn = passwordStatusService.PasswordValidation();

        LOG.debug("Fim do metrodo checkPassword: retorno da validação da senha = {}" , validationReturn );
        
        return validationReturn;

    }

}

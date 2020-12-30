package br.com.password.validation.controller;

import br.com.password.validation.VO.ReturnStatusPasswordVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.password.validation.service.PasswordStatusService;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class PasswordController {
	private static final Logger LOG = LoggerFactory.getLogger(PasswordController.class);

    @GetMapping(path = "/")
    public ResponseEntity<ReturnStatusPasswordVO> checkPassword (@RequestParam (value = "password") String password) {

        LOG.info(" ");
        LOG.debug("Inicio do método checkPassword");
        LOG.info("Senha recebida : {}" , password);

        PasswordStatusService passwordStatusService = new PasswordStatusService(password);

//        validationReturn = passwordStatusService.PasswordValidation();

        ReturnStatusPasswordVO returnStatusPasswordVO = new ReturnStatusPasswordVO(password);
        returnStatusPasswordVO.isStatusPassword();

        LOG.debug("Fim do metrodo checkPassword: retorno da validação da senha = {}" , returnStatusPasswordVO );

        return ResponseEntity.ok(returnStatusPasswordVO);

    }

}

package br.com.password.validation.service;

import br.com.password.validation.controller.PasswordController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.password.validation.service.PasswordStatusService;

public class PasswordStatusService {
    private static final Logger LOG = LoggerFactory.getLogger(PasswordController.class);
    public static boolean validationReturn = false;
    private String word;
    WordValidationService wordValidation;

    public PasswordStatusService(String password) {
        this.word = password;

        LOG.debug("Início do método PasswordStatusService - Recebi a senha: {}" , password);

        wordValidation = new WordValidationService(this.word);

        LOG.debug("Fim do método PasswordStatusService");
    }

    public boolean PasswordValidation () {

        LOG.debug("Início do método PasswordValidation");

        validationReturn = wordValidation.ValidationSizeMin();
        
        LOG.info("1 - Tem tamanho mínimo: {}" , validationReturn);
        
        if (validationReturn == false) {
            return false;
        }

        // Se a senha estiver com espaços retorna falso
        validationReturn = wordValidation.NoSpaceChar();
        
        LOG.info("2 - Não tem espaço: {} " , validationReturn);
        
        if (validationReturn == false) {
            return false;
        }

        validationReturn = wordValidation.SpecialChar();
        
        LOG.info("3 - Tem caracter especial: {} " , validationReturn);
        
        if (validationReturn == false) {
            return false;
        }

        validationReturn = wordValidation.isNumeric();
        
        LOG.info("4 - Tem número: {} " , validationReturn );
        
        if (validationReturn == false) {
            return false;
        }

        validationReturn = wordValidation.isLetter();
        
        LOG.info("5 - Tem letra: {} " , validationReturn );
        
        if (validationReturn == false) {
            return false;
        }

        validationReturn = wordValidation.UpperCase();
        
        LOG.info("6 - Tem letra maiuscula: {} " , validationReturn);
        
        if (validationReturn == false) {
            return false;
        }
        
        validationReturn = wordValidation.LowerCase();
        
        LOG.info("7 - Tem letra minuscula: {} " , validationReturn);
        
        if (validationReturn == false) {
            return false;
        }

        validationReturn = wordValidation.NoEqualChar();
        
        LOG.info("8 - Não tem caracter repetido: {} " , validationReturn);
        
        if (validationReturn == false) {
            return false;
        }

        LOG.debug("Fim do método PasswordValidation");
        
        return true;
    }
}

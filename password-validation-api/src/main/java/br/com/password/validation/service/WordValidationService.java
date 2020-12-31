package br.com.password.validation.service;

import br.com.password.validation.controller.PasswordController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static br.com.password.validation.constants.Constants.CARACTER_ESPECIAL;
import static br.com.password.validation.constants.Constants.TAMANHO_MINIMO;

public class WordValidationService {
    private static final Logger LOG = LoggerFactory.getLogger(PasswordController.class);
	private String word;

    public WordValidationService(String password) {
        LOG.debug("Construtor WordValidationService {}" , password);

    	this.word = password;
    }

    public boolean ValidationSizeMin() {

        LOG.debug("Início do métodoo ValidationSizeMin");

        if (this.word.length() < TAMANHO_MINIMO) {
            return false;
        } else {
            return true;
        }
    }

    public boolean NoSpaceChar() {

        LOG.debug("Início do métodoo NoSpaceChar");

        if (!this.word.contains(" ")) {
            return true;
        } else {
            return false;
        }

    }

    public boolean SpecialChar () {

        LOG.debug("Início do métodoo SpecialChar");

        if (this.word.contains("!") ||
                this.word.contains("@") ||
                this.word.contains("#") ||
                this.word.contains("$") ||
                this.word.contains("%") ||
                this.word.contains("^") ||
                this.word.contains("&") ||
                this.word.contains("*") ||
                this.word.contains("(") ||
                this.word.contains(")") ||
                this.word.contains("-") ||
                this.word.contains("+")
        ) {
            LOG.debug("Encontrei o caracter especial {}" , this.word);
            return true;
        } else {
            return false;
        }

    }

    public boolean IsNumeric () {
        char currentChar;
        boolean returnValidation = false;

        LOG.debug("Início do métodoo isNumeric");

        for (int i = 0; i < this.word.length(); i++) {
            currentChar = this.word.charAt(i);
            if (Character.isDigit(currentChar)) {
                LOG.debug("Encontrei o caracter numérico {}" , currentChar);
                returnValidation = true;
            }
        }

        return returnValidation;
    }

    public boolean IsLetter () {
        char currentChar;
        boolean returnValidation = false;

        LOG.debug("Início do métodoo isLetter");

        for (int i = 0; i < this.word.length(); i++) {
            currentChar = this.word.charAt(i);
            if (Character.isLetter(currentChar)) {
                LOG.debug("Encontrei a letra {}" , currentChar);
                returnValidation = true;
            }
        }

        return returnValidation;
    }

    public boolean UpperCase () {
        char currentChar;
        boolean returnValidaton = false;

        LOG.debug("Início do métodoo UpperCase");

        for (int i = 0; i < this.word.length(); i++) {
            currentChar = this.word.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                LOG.debug("Encontrei o caracter maiusculo {}" , currentChar);
                returnValidaton = true;
            }
        }

        return returnValidaton;
    }

    public boolean LowerCase () {
        char currentChar;
        boolean returnValidation = false;

        LOG.debug("Início do métodoo LowerCase");

        for (int i = 0; i < this.word.length(); i++) {
            currentChar = this.word.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                LOG.debug("Encontrei o caracter minusculo {}" , currentChar);
                returnValidation = true;
            }
        }

        return returnValidation;
    }

    public boolean NoEqualChar () {
        boolean returnValidatoin = true;

        LOG.debug("Início do métodoo NoEqualChar");

        for (int i = 0; i < this.word.length(); i++) {
            for (int c = i + 1; c < this.word.length(); c++) {
                if (this.word.charAt(i) == this.word.charAt(c)) {
                    LOG.debug("Encontrei o caracter repetido {} na {}ª posição e na {}ª posião", this.word.charAt((i)), i, c);
                    returnValidatoin = false;
                    break;
                }
            }
        }

        return returnValidatoin;
    }
}
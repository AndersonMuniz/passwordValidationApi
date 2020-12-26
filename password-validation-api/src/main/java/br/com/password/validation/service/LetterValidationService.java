package br.com.password.validation.service;

import br.com.password.validation.controller.PasswordController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LetterValidationService {
    private static final Logger LOG = LoggerFactory.getLogger(PasswordController.class);
    private String classWord;
    private boolean returnValidation = false;
    private char currentChar;
    private int i = 0;

    public LetterValidationService(String findWord) {
        this.classWord = findWord;
    }

    public boolean LetterValidationFind (){

        LOG.debug("Início do método LetterValidationFind");

        for (i = 0; i < this.classWord.length(); i ++) {
            currentChar = this.classWord.charAt(i);
            returnValidation = LetterValidationFunction();
        }

        return returnValidation;
    }

    private boolean LetterValidationFunction () {
        boolean returnNumeric = false;
        boolean returnLetter = false;
        boolean returnUpperCase = false;
        boolean returnLowerCase = false;
        boolean returnNoEqualChar = true;

        LOG.debug("Início do método LetterValidationFunction");

        if (Character.isDigit(currentChar)) {
            returnNumeric = true;
        }

        if (Character.isLetter(currentChar)) {
            returnLetter = true;
        }

        if (Character.isUpperCase(currentChar)) {
            returnUpperCase = true;
        }

        if (Character.isLowerCase(currentChar)) {
            returnLowerCase = true;
        }

        for (int c = i +1; c < this.classWord.length(); c++) {
            if (this.classWord.charAt(i) == this.classWord.charAt(c)) {
                returnNoEqualChar = false;
                break;
            }
        }

        if (returnNumeric == false || returnLetter == false || returnUpperCase == false || returnLowerCase == false || returnNoEqualChar == false) {
            returnValidation = false;
        } else {
            returnValidation = true;
        }

        LOG.debug("Fim do método LetterValidationFunction - Númerico: {} - Letra: {} - Maiuscula {} - Minuscula {} - Todos os caracteres diferentes {} " , returnNumeric , returnLetter , returnUpperCase , returnLowerCase , returnNoEqualChar);

        return returnValidation;
    }
}
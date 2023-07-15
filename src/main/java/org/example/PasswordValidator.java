package org.example;

public class PasswordValidator {

    private static final String WRONG_PASSWORD_LENGTH_EXCEPTIION_MESSAGE = "비밀 번호는 최소 8자 이상 1자 이하여야 한다.";
    public static void validate(String password) {
        int length = password.length();
        if(length < 8 || length > 12){
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTIION_MESSAGE);
        }
    }
}

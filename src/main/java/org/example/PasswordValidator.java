package org.example;

public class PasswordValidator {
    public static void validate(String password) {
        int length = password.length();
        if(length < 8 || length > 12){
            throw new IllegalArgumentException("비밀 번호는 최소 8자 이상 1자 이하여야 한다.");
        }
    }
}

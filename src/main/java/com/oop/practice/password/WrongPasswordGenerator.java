package com.oop.practice.password;

public class WrongPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "bb";
    }
}

package com.oop.practice.password;

public class CorrectPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "aaaabbbbcc";
    }
}

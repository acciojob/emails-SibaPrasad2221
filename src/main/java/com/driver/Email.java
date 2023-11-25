package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(password.equals(oldPassword)){
            int len = newPassword.length();
            boolean isOneUpperCase=false;
            boolean isOneLowerCase=false;
            boolean isOneDigit=false;
            boolean isSpecialChar=false;

            for(int i=0;i<len;i++){
                char ch = newPassword.charAt(i);
                if(ch>=65 && ch<=90) isOneUpperCase = true;

                if(ch>=97 && ch<=122) isOneLowerCase = true;

                if(ch>=0 && ch<=9) isOneDigit = true;


            }

            if(len>=8 && isOneUpperCase && isOneLowerCase && isOneDigit && isSpecialChar){
                password = newPassword;
            }

        }
    }
}

package com.driver;

import java.util.Date;


public class Mail {
    Date dt;
    String sender;
    String message;
    Mail(Date dt, String sender, String message){
        this.dt= dt;
        this.message = message;
        this.sender = sender;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.lab.promotion.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MessageEmail {
    private String user;
    private String subject;
    private String promotion;

    private final String message = "%s Hoy es su cumpleaños y usted es importante para nosotros, queremos celebralo " +
            "ofreciendo un %s de descuento y delivery gratuito. Valido por 24 hrs";


    public MessageEmail(String subject, String promotion){
        this.subject = subject;
        this.user = "";
        this.promotion = promotion;
    }

    public String getMessage(){
        return String.format(this.message, this.user, this.promotion);
    }

    public String getSubject(){
        return subject;
    }
    public void setUser(String user){
        this.user = user;
    }
}

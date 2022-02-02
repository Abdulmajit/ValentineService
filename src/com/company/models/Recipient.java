package com.company.models;

public class Recipient {
    private String recipient;
    private String MyPhone;

    public Recipient(){ }

    public Recipient(String recipient, String MyPhone){
        this.recipient = recipient;
        this.MyPhone = MyPhone;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMyPhone() {
        return MyPhone;
    }

    public void setMyPhone(String myPhone) {
        MyPhone = myPhone;
    }
}

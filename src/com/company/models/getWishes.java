package com.company.models;

public class getWishes {
    private Recipient recipient;

    public getWishes(){ }

    public getWishes(Recipient recipient){
        this.recipient = recipient;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }
}

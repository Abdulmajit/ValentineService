package com.company.service.impl;

import com.company.models.Subscriber;
import com.company.service.SubscriberService;

public class SubscriberServiceImpl implements SubscriberService {

    protected Subscriber[] subscribers = new Subscriber[50];


    @Override
    public Subscriber findOrCreateSubscriber(String phone) {

        for (int i = 0; i < subscribers.length; i++) {
            if(subscribers[i] == null){
                Subscriber subscriber = new Subscriber(phone);
                subscribers[i] = subscriber;
                return subscriber;
            }
            else{
                if(subscribers[i].getPhone().equals(phone)){
                    return subscribers[i];
                }
                else{
                    continue;
                }
            }
        }
        throw new RuntimeException("Мавив переполнен");
    }

}

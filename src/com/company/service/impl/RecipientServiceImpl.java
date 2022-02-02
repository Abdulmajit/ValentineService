package com.company.service.impl;

import com.company.models.Recipient;
import com.company.models.Subscriber;
import com.company.service.RecipientService;
import com.company.service.SubscriberService;

public class RecipientServiceImpl extends SubscriberServiceImpl implements RecipientService, SubscriberService {
    @Override
    public Recipient seeMyMessages(String MyPhone) {
        for (int i = 0; i < subscribers.length; i++) {
            if (subscribers[i] != null) {
                if (subscribers[i].getPhone().equals(MyPhone)) {
                    System.out.println(subscribers[i]);
                } else {
                    continue;
                }
            }
            else{
                continue;
            }
        }
        throw new RuntimeException("You don't have a wishes");
    }
}

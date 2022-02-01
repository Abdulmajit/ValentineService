package com.company.service;

import com.company.models.Subscriber;

public interface SubscriberService {

    Subscriber findOrCreateSubscriber(String phone);


}

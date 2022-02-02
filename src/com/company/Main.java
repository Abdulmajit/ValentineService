package com.company;

import com.company.models.Recipient;
import com.company.models.Subscriber;
import com.company.service.RecipientService;
import com.company.service.WishService;
import com.company.service.impl.RecipientServiceImpl;
import com.company.service.impl.WishServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WishService wishService = new WishServiceImpl();
        RecipientService recipientService = new RecipientServiceImpl();

        while (true){
            System.out.println("Выберите действие:");
            System.out.println(" "+
                    "1. Отправить сообщение\n " +
                    "2. Просмотреть доступные сообщения\n " +
                    "3. Выход");

            System.out.println("Ваш выбор: ");
            int data = scanner.nextInt();

            switch (data){
                case 1:
                    System.out.println(" Введите номер получателя ");
                    String receiptPhone = scanner.next();
                    System.out.println(" Введите номер отправителя ");
                    String senderPhone = scanner.next();
                    System.out.println(" Введите текст который хотите отправить");
                    String text = scanner.next();
                    wishService.createWish(text, senderPhone, receiptPhone);
                    break;
                case 2:
                    System.out.println("Для просмотра входящих сообщения введите свой номер");
                    System.out.print("Номер : ");
                    String MyPhone = scanner.next();
                    recipientService.seeMyMessages(MyPhone);
                    break;
                case 3:
                    System.out.println("До свидания!");
                    break;
            }

        }
    }
}

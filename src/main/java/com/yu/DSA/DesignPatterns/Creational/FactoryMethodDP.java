package com.yu.DSA.DesignPatterns.Creational;

interface NotificationSender {
    void send();
}

class EmailNotificationSender implements NotificationSender{

    @Override
    public void send() {
        System.out.println("Email Notification Sent");
    }
}

class SMSNotificationSender implements NotificationSender {

    @Override
    public void send() {
        System.out.println("SMS Notification Sent");
    }
}

abstract class NotificationCreator {//Service
    public abstract NotificationSender createNotificationSender();

    public void notifyUser() {
        NotificationSender sender = createNotificationSender();
        sender.send();
    }
}
class EmailNotificationCreator extends NotificationCreator{

    @Override
    public NotificationSender createNotificationSender() {
        return new EmailNotificationSender();
    }
}
class SmsNotificationCreator extends NotificationCreator {

    @Override
    public NotificationSender createNotificationSender() {
        return new SMSNotificationSender();
    }
}

public class FactoryMethodDP {
    public static void main(String[] args) {
        boolean isSms = true;
        NotificationCreator creator = isSms? new SmsNotificationCreator() : new EmailNotificationCreator();
        creator.notifyUser();
    }
}

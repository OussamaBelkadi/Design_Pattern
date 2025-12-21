package FactoryDesign;

import FactoryDesign.enums.NotificationType;

public class NotificationFactory {
    public static Notification createNotification(NotificationType type) throws IllegalAccessException {
        switch (type) {
            case Email -> {
                return new EmailNotification();
            }
            case SMS -> {
                return new SmsNotification();
            }
            default -> throw new IllegalAccessException("Unknow Notification Type");
        }
    }
}

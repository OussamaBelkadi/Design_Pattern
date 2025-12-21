package FactoryDesign;

public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email Message");
    }

    @Override
    public void message() {

    }
}

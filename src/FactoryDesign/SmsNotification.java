package FactoryDesign;

public class SmsNotification implements Notification{
    @Override
    public void message(){

    }
    @Override
    public void send(){
        System.out.println("Sending SMS Notification");
    }
}

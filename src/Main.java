import FactoryDesign.Notification;
import FactoryDesign.NotificationFactory;
import FactoryDesign.enums.NotificationType;
import SingletonDesign.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        factoryExample();
    }
    // Factory Design
    private static void factoryExample() throws IllegalAccessException{
        Notification email = NotificationFactory.createNotification(NotificationType.Email);
        email.send();

        Notification sms = NotificationFactory.createNotification(NotificationType.SMS);
        sms.send();
    }

    // Singleton Design
    private static void singletonExample(){
        Logger logger = Logger.getInstance();
        logger.log("Log Message");
    }
}
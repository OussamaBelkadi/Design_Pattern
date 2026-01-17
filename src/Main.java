import FactoryDesign.Notification;
import FactoryDesign.NotificationFactory;
import FactoryDesign.enums.NotificationType;
import PrototypeDesign.Shape;
import PrototypeDesign.ShapeCache;
import SingletonDesign.Logger;
import SingletonDesign.Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        factoryExample();
        Singleton singleton = Singleton.getInstance();
        builderExample();
        prototypeExample();
    }

    // Prototype Design
    private static void prototypeExample(){
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());
        clonedShape.draw();
    }
    // Builder Design
    private static void builderExample(){
        BuilderDesign.Car car = new BuilderDesign.Car.CarBuilder()
                .setEngine("V8")
                .setWheels(4)
                .setColor("Red")
                .build();
        System.out.println(car);
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
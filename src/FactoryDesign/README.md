# Factory Design Pattern

The **Factory Design Pattern** is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## 📝 Problem
Imagine you are building a notification system. Initially, you only have `EmailNotification`. Your code is tightly coupled with the `EmailNotification` class. Later, if you need to add `SmsNotification`, you would have to change the code in many places, making it hard to maintain.

## 💡 Solution
The Factory Pattern suggests that you replace direct object construction calls (using the `new` operator) with calls to a special *factory* method. This method handles the logic of creating objects, so the client code doesn't need to know the specific class being instantiated.

## 🏗️ Structure in this Project

- **Product (`Notification.java`)**: The interface that defines the operations all concrete products must implement.
- **Concrete Products (`EmailNotification.java`, `SmsNotification.java`)**: Different implementations of the `Notification` interface.
- **Factory (`NotificationFactory.java`)**: Contains the static method `createNotification` that decides which class to instantiate based on the provided `NotificationType`.

## 🚀 How to Use

To create a notification, you simply interact with the factory:

```java
Notification notification = NotificationFactory.createNotification(NotificationType.Email);
notification.send();
```
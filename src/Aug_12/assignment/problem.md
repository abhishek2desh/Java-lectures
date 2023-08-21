      1.    Create an interface Animal with methods feed() and makeSound() to represent basic animal behaviors.
        Create interfaces for specific behaviors, such as Swimmable with methods swim() for aquatic animals and Climbable with methods climb() for animals that can climb.
        Implement classes for different animal types (e.g., Lion, Penguin, Monkey) that implement the relevant interfaces.
        Each animal type should exhibit its unique behaviors, such as a lion roaring and a penguin swimming.
        Design the architecture to allow the addition of new animal types with minimal code changes.


      2.    Create an interface NotificationSender with a method sendNotification(String message) to represent the basic notification sending functionality.
        Create interfaces for different notification channels, such as EmailNotification with methods for setting recipients and sending email notifications, SMSNotification with methods for specifying phone numbers and sending SMS notifications, and PushNotification with methods for sending push notifications to devices.
        Implement classes that represent each notification channel (e.g., EmailNotificationSender, SMSNotificationSender, PushNotificationSender) that implement the corresponding interfaces.
        Each notification channel class should encapsulate the logic for sending notifications through its respective channel.
        Design the architecture in a way that new notification channels can be added with minimal code modifications.
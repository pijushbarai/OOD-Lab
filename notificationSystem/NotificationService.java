// package notificationSystem;


public class NotificationService{
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification1 = notificationFactory.createNotification("Sms");
        Notification notification2 = notificationFactory.createNotification("Push");
        Notification notification3 = notificationFactory.createNotification("Email");
        Notification notification4 = notificationFactory.createNotification("App");
        notification2.notifyUser("hi");
        notification1.notifyUser("Hi everyone");
        notification3.notifyUser("How old are you");
        notification4.notifyUser("4 notification");
    }
}
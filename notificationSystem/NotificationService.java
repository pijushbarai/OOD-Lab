// package notificationSystem;


public class NotificationService{
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        Notification notification2 = notificationFactory.createNotification("PUSH");
        String str = "Hi everybody";
        notification2.notifyUser(str);
        notification.notifyUser(str);
    }
}
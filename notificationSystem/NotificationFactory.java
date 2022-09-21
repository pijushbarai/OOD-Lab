// package notificationSystem;

public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel == null || channel.isEmpty()){
            return null;
        }
        switch(channel){
            case "Sms":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            case "Push":
                return new PushNotification();
            case "App":
                return new AppNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}

package service.notifications;

import java.util.Date;

public class NotifyByEmail implements  Notification{
    private String notificationId;
    private Date creationDate;
    private String content;
    private String Email;


    @Override
    public boolean sendNotifications() {
        // logic to send notifications by email
        return false;
    }
}

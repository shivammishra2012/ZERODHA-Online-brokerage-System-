package service.notifications;

import java.util.Date;

public class NotifyBySms implements Notification{

    public NotifyBySms(String notificationId, Date creationDate, String content) {
        this.notificationId = notificationId;
        this.creationDate = creationDate;
        this.content = content;
    }

    private String notificationId;
    private Date creationDate;
    private String content;
    @Override
    public boolean sendNotifications() {

        // logic to send notifications by sms
        return false;
    }
}

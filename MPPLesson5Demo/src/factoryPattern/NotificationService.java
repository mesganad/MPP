package factoryPattern;

public class NotificationService {

	public static void main(String[] args) {
		NotificationFactory nf=new NotificationFactory();
		Notification notification=nf.createNewNotification("sms");
		notification.notifyUser();
	}
}

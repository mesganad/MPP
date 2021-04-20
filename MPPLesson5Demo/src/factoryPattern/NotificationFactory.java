package factoryPattern;

public class NotificationFactory {
	public Notification createNewNotification(String channel) {
		
		if(channel==null || channel.isEmpty()) {
			return null;
		}
		if("SMS".equalsIgnoreCase(channel)) {
			return new SMSNotification();
		}
		else if("Email".equalsIgnoreCase(channel)) {
			return new EmailNotification();
		}
		else if("Push".equalsIgnoreCase(channel)) {
			return new PushNotification();
		}
		else
			return null;
	}

}

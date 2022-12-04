package 데코레이터.notification;

public class EmailNotifier implements Notifier{

    private Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public EmailNotifier() {
    }

    @Override
    public void send() {
        notifier.send();
        System.out.println("이메일 알림");
    }
}

package 데코레이터.notification;

public class BasicNotifier implements Notifier {

    // 생성자가 없다.
    // 어떤 것도 의존해서는 안된다.
    @Override
    public void send() {
        System.out.println("기본 알림");
    }
}

package 데코레이터;

import 데코레이터.notification.BasicNotifier;
import 데코레이터.notification.EmailNotifier;
import 데코레이터.notification.Notifier;
import 데코레이터.notification.SmsNotifier;

/**
 * 데코레이터 패턴 (장식하다)
 * ( A ) -> B(A) -> C(B(A))
 */
public class App {
    public static void main(String[] args) {
//        Notifier notifier = new BasicNotifier();
//        notifier.send();
//        System.out.println("__end");

//        Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
//        emailNotifier.send();
//        System.out.println("__end");

//        Notifier snsNotifier = new SnsNotifier(new BasicNotifier());
//        snsNotifier.send();
//        System.out.println("__end");


        // 1. 전체알림 ( 기본 -> 문자 -> 이메일 )
        Notifier allNotifier1 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        allNotifier1.send();
        System.out.println("__end");

        // 2. 전체알림 ( 기본 -> 이메일 -> 문자 )
        Notifier allNotifier2 = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        allNotifier2.send();
        System.out.println("__end");

        // 3. 전체알림 ( 기본 -> ~~~~~~~~~ 무한.. )
        Notifier allNotifier3 = new SmsNotifier(new EmailNotifier(new EmailNotifier(new BasicNotifier())));
        allNotifier3.send();
        System.out.println("__end");

        // 4. 기본알림
        Notifier basicNotifier = new BasicNotifier();
        basicNotifier.send();
        System.out.println("__end");

        // 5. 기본알림 -> 문자알림
        Notifier emailNotifier = new SmsNotifier(new BasicNotifier());
        emailNotifier.send();
        System.out.println("__end");

        // 6. 이메일알림 -> 현재 null exception -> 조건문으로 변경
        Notifier onlyEmailNotifier = new EmailNotifier();
        onlyEmailNotifier.send();
        System.out.println("__end");

        // 7. 문자 알림
        SmsNotifier smsNotifier = new SmsNotifier();
        smsNotifier.send();
        System.out.println("__end");

        // 8. 문자 알림 -> 이메일 알림
        Notifier smsAndEmailNotifier = new EmailNotifier(new SmsNotifier());
        smsAndEmailNotifier.send();
        System.out.println("__end");
    }

}

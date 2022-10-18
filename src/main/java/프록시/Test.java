package 프록시;

// 구체적인것을 추상화
public class Test {
    public static void main(String[] args) {

        Animal mouse = new Mouse();
        Animal cat = new Cat();

        // DoorMan 타입인 DoorManProxy 를 사용
        // 기존코드를 수정하지 않는다.
        // 기존의 코드를 재활용한다.
        DoorMan doorMan = new DoorManProxy();

        doorMan.쫓아낸다(mouse);
        doorMan.쫓아낸다(cat);
    }
}

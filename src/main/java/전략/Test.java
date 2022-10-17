package 전략;

// 구체적인것을 추상화
public class Test {
    public static void main(String[] args) {

        Animal mouse = new Mouse();
        Animal cat = new Cat();

        DoorMan doorMan = new DoorMan();

        doorMan.쫓아낸다(mouse);
        doorMan.쫓아낸다(cat);
    }
}

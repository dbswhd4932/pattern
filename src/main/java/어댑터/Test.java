package 어댑터;

/**
 *  어댑터 패턴
 *  외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우
 *  외부 요소를 기존 시스템에 재사용하기 싶지만 호환되지 않는 경우 ( 해당 실습 )
 *
 *  기존 클래스를 건들이지 않고 Adapter 를 사용한다.
 */
public class Test {
    public static void main(String[] args) {

        Animal mouse = new Mouse();
        Animal cat = new Cat();
        Animal dog = new Dog();

        TigerAdapter ot = new TigerAdapter(new OuterTiger());
//        Animal outerTigerProxy = new OuterTigerProxy();
        DoorMan doorMan = new DoorMan();

        doorMan.쫓아낸다(mouse);
        doorMan.쫓아낸다(cat);
        doorMan.쫓아낸다(dog);
        doorMan.쫓아낸다(ot);

    }
}

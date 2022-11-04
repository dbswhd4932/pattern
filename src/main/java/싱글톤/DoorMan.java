package 싱글톤;

/**
 *  문지기를 한명만 만들고 싶을때.
 */
public class DoorMan {

    // static 은 main 메서드를 호출하기 전에 메모리에 올라간다.
    private static DoorMan doorMan = new DoorMan();

    public static DoorMan getDoorMan() { // heap 이 관리하는 메소드
        return doorMan;
    }

    private DoorMan() {
    }

    public void 쫓아낸다(Animal animal) {
        System.out.println(animal.getName()+" 쫓아낸다");
    }
}

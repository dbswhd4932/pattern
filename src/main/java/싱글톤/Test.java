package 싱글톤;

public class Test {
    public static void main(String[] args) {

        DoorMan doorMan = DoorMan.getDoorMan();
        DoorMan doorMan2 = DoorMan.getDoorMan();

        System.out.println("doorMan = " + doorMan);
        System.out.println("doorMan2 = " + doorMan2);
        System.out.println(doorMan == doorMan2); // true

        doorMan.쫓아낸다(new Mouse());

    }
}

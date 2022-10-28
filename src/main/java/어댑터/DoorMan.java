package 어댑터;

public class DoorMan {

    public void 쫓아낸다(Animal animal) {
        System.out.println(animal.getName()+" 쫓아낸다");
    }

    public void 들여보낸다(Animal animal) {
        System.out.println(animal.getName() + " 들여보낸다.");
    }
}

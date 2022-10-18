package 프록시;

public class DoorManProxy extends DoorMan{

    @Override
    public void 쫓아낸다(Animal animal) {
        System.out.println("안녕을 추가");
        super.쫓아낸다(animal);
    }
}

package 어댑터;

public class TigerAdapter extends Animal {

    private OuterTiger outerTiger;

    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

        @Override
    public String getName() {
        return outerTiger.getFullName();
    }

//    @Override
//    public String getName() {
//        return null;
//    }


}

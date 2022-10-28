package 어댑터;

public class OuterTigerProxy extends Animal{

    private String fullName = "가짜호랑이";

    @Override
    public String getName() {
        return fullName;
    }
}

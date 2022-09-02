public class ImplModernChair implements Chair {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public String sitOn() {
        return "Real comfy!";
    }

}

public class ImplClassicChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public String sitOn() {
        return "Just like old times!";
    }
}

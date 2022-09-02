public class ImplModernTable implements Table {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public String getShape() {
        return "Rectangular";
    }
}

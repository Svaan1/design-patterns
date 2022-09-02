public class ImplClassicTable implements Table {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public String getShape() {
        return "Oval";
    }
}

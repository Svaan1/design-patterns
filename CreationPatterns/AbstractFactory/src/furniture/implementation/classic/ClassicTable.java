package furniture.implementation.classic;

import furniture.Table;

public class ClassicTable implements Table {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public String getShape() {
        return "Oval";
    }
}

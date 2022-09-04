package furniture.implementation.modern;

import furniture.Table;

public class ModernTable implements Table {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public String getShape() {
        return "Rectangular";
    }
}

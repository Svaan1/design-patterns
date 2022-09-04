package furniture.implementation.modern;

import furniture.Chair;

public class ModernChair implements Chair {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public String sitOn() {
        return "Real comfy!";
    }

}

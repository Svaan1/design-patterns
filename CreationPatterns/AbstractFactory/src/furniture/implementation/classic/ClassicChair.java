package furniture.implementation.classic;

import furniture.Chair;

public class ClassicChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public String sitOn() {
        return "Just like old times!";
    }
}

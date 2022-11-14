package org.o7planning.tutorial.comparation.equals;

public class NumberOfMedals {
    private int goldCount;
    private int silverCount;
    private int bronzeCount;

    public NumberOfMedals(int goldCount, int silverCount, int bronzeCount) {
        this.goldCount = goldCount;
        this.silverCount = silverCount;
        this.bronzeCount = bronzeCount;
    }

    public int getGoldCount() {
        return goldCount;
    }

    public int getSilverCount() {
        return silverCount;
    }

    public int getBronzeCount() {
        return bronzeCount;
    }

    @Override
    public boolean equals(Object other) {
        if(other == null || !(other instanceof NumberOfMedals)) {
            return false;
        }
        NumberOfMedals otherNoM = (NumberOfMedals) other;
        if(this.goldCount == otherNoM.getGoldCount() && this.silverCount == otherNoM.getSilverCount() && this.bronzeCount == otherNoM.getBronzeCount()) {
            return true;
        }
        return false;
    }
}

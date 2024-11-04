package model;

public class Referee extends Person{
    RefereeType type;

    public Referee() {
    }

    public RefereeType getType() {
        return type;
    }

    public void setType(RefereeType type) {
        this.type = type;
    }
}

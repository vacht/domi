package model;

public class Player extends Person{

    private int number;
    private PlayerPosition position;

    public Player() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }
}

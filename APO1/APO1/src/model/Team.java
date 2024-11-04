package model;

import java.util.ArrayList;

public class Team {

    private Country country;
    private ArrayList<Player> players;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}

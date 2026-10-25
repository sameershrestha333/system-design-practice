package lld.oop.relationships.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }


    public void removePlayer(Player player) {
        players.remove(player);
    }


    public void showPlayer() {
        System.out.println("Team : " + name);
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
}

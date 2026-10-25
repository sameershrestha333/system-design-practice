package lld.oop.relationships.aggregation;

public class AggregationMain {
    public static void main(String[] args) {
        Player player1 = new Player("Sameer1");
        Player player2 = new Player("Sameer2");

        Team team = new Team("Team1");

        team.addPlayer(player1);
        team.showPlayer();
    }
}

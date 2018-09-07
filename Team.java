import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    private ArrayList<T> team = new ArrayList<T>();

    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;

    Team(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    boolean addPlayer(T player) {
        if(team.contains(player)) {
            System.out.println(player.getName() + " is already in team " + getName());
            return false;
        } else {
            team.add(player);
            System.out.println(player.getName() + " was added to team " + getName());
            return false;
        }
    }

    void matchResult(Team<T> opponentTeam, int ourScore, int opponentScore) {
        String outcome;

        if(ourScore > opponentScore) {
            outcome = " won over ";
            won++;
        } else if(ourScore < opponentScore) {
            outcome = " lost over ";
            lost++;
        } else{
            outcome = " tied against ";
            tied++;
        }
        played++;

        if(opponentTeam != null) {
            System.out.println(this.getName() + outcome + opponentTeam.getName() +
                    " with " + ourScore + ":" + opponentScore);

            opponentTeam.matchResult(null, opponentScore, ourScore);
        }
    }

    int rank() {
        return (won * 2) + tied;
    }

    public int compareTo(Team<T> opponent) {
        if(this.rank() > opponent.rank()) {
            return -1;
        } else if(this.rank() < opponent.rank()) {
            return 1;
        } else {
            return 0;
        }
    }

    String stats() {
        return this.getName() + " has : " +
                "played " + played + ((played<= 1) ? " time" : " times") +
                ", won " + won + ((won<= 1) ? " time" : " times") +
                ", lost " + lost + ((lost<= 1) ? " time" : " times") +
                " and tied " + tied + ((tied<= 1) ? " time" : " times");
    }
}


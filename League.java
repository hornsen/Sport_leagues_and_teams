import java.util.ArrayList;
import java.util.Collections;

class League<T extends Team> {

    private String name;

    private ArrayList<T> leagueMembers = new ArrayList<T>();

    League(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    boolean addTeam(T team) {
        if(leagueMembers.contains(team)) {
            System.out.println(team.getName() + " is already in league " + this.getName());
            return false;
        } else {
            System.out.println(team.getName() + " was added to league " + this.getName());
            leagueMembers.add(team);
            return true;
        }
    }

    void leagueTable() {
        Collections.sort(leagueMembers);
        System.out.println("Ranking for league " + this.getName() + " is currently:");
        for(int i=0; i<leagueMembers.size(); i++) {
            System.out.println((i+1) + ". " + leagueMembers.get(i).getName() + " with "
                    + leagueMembers.get(i).rank() + " points");
        }

    }

}

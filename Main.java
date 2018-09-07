public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n\n*** Football ***");

        // Football team Djurgårdens IF
        Team<FootballPlayer> dif = new Team<FootballPlayer>("DIF");
        FootballPlayer isaksson = new FootballPlayer("Isaksson");
        dif.addPlayer(isaksson);

        // Football team AIK
        Team<FootballPlayer> aik = new Team<FootballPlayer>("AIK");
        FootballPlayer stamatopoulos = new FootballPlayer("Stamatopoulos");
        aik.addPlayer(stamatopoulos);

        System.out.println();
        League<Team<FootballPlayer>> allsvenskan = new League<Team<FootballPlayer>>("Allsvenskan");
        allsvenskan.addTeam(dif);
        allsvenskan.addTeam(aik);

        System.out.println("\nFootball matches: ");
        dif.matchResult(aik, 3, 2);
        dif.matchResult(aik, 1, 2);
        dif.matchResult(aik, 2, 1);

        System.out.println("\nFootball stats: ");
        System.out.println(dif.stats());
        System.out.println(aik.stats());

        // Football league rankings
        System.out.println();
        allsvenskan.leagueTable();


        System.out.println("\n\n\n*** Ice hockey ***");
        // Ice hockey team Leksands IF
        Team<IcehockeyPlayer> leksandsIF = new Team<IcehockeyPlayer>("Leksands IF");
        IcehockeyPlayer bergkvist = new IcehockeyPlayer("Bergkvist");
        leksandsIF.addPlayer(bergkvist);

        // Ice hockey team IF Björklöven
        Team<IcehockeyPlayer> ifBjorkloven = new Team<IcehockeyPlayer>("IF Björklöven");
        IcehockeyPlayer andersson = new IcehockeyPlayer("Andersson");
        ifBjorkloven.addPlayer(andersson);

        System.out.println();
        League<Team<IcehockeyPlayer>> hockeyAllsvenskan = new League<Team<IcehockeyPlayer>>("HockeyAllsvenskan");
        hockeyAllsvenskan.addTeam(leksandsIF);
        hockeyAllsvenskan.addTeam(ifBjorkloven);

        System.out.println("\nIce hockey matches: ");
        leksandsIF.matchResult(ifBjorkloven, 1, 1);
        ifBjorkloven.matchResult(leksandsIF, 2, 0);
        ifBjorkloven.matchResult(leksandsIF, 4, 1);

        System.out.println("\nIce hockey stats: ");
        System.out.println(leksandsIF.stats());
        System.out.println(ifBjorkloven.stats());

        // Ice hockey league rankings
        System.out.println();
        hockeyAllsvenskan.leagueTable();
    }
}

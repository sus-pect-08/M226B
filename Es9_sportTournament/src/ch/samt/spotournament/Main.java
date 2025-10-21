package ch.samt.spotournament;

public class Main {
    public static void main(String[] args) {

        TournamentManager manager = new TournamentManager();
        manager.addTeam(new Team("Lupi Verdi", "Scuola Alfa", "calcio", 12));
        manager.addTeam(new Team("Tigri Blu", "Scuola Beta", "pallavolo", 15));
        manager.addTeam(new Team("Falchi Rossi", "Scuola Alfa", "calcio", 12));
        manager.addTeam(new Team("Pantere Nere", "Scuola Gamma", "basket", 9));
        manager.addTeam(new Team("Lupi Verdi", "Scuola Alfa", "basket", 12));

        System.out.println("\n *** Squadre in ordine naturale (punteggio decrescente) ***");
        manager.printTeamsSortedByNeutral();

        System.out.println("\n *** Squadre ordinate per scuola ***");
        manager.printTeamsSortedBySchool();

        System.out.println("\n *** Squadre ordinate per sport ***");
        manager.printTeamsSortedBySport();

        manager.updateScore("Lupi Verdi", 3);

        System.out.println("\n *** Punteggi attuali ***");
        manager.printScores();

    }
}
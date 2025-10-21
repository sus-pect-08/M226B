package ch.samt.spotournament;

import java.util.*;
import java.util.Comparator;

public class TournamentManager  {
    Set teams = new HashSet();
    Map<String, Integer> points = new HashMap();
    //List<Team> sortedTeams = new ArrayList<>(teams);
    public void addTeam(Team t){
        Boolean added = teams.add(t);
        points.put(t.getName(), t.getTotalPoints());
        if (added){
            System.out.println("Team " + t.getName() + " aggiunto al torneo di " + t.getSport());
        }else{
            System.out.println("Team " + t.getName() + " non aggiunto al torneo");
        }

    }

    public void updateScore(String teamName, int delta){
        points.put(teamName, points.getOrDefault(teamName, 0) + delta);
        System.out.println("+ " + delta + " punti a " + teamName + "!");
    }
    public void printTeamsSortedByNeutral(){
        List<Team> sortedTeams = new ArrayList<>(teams);
        Collections.sort(sortedTeams);
        System.out.println(sortedTeams);
    }
    public void printTeamsSortedBySchool(){
        List<Team> sortedTeams = new ArrayList<>(teams);
        Collections.sort(sortedTeams, (new SchoolComparator()));
//
        System.out.println(sortedTeams);
    }
    public void printTeamsSortedBySport(){
        List<Team> sortedTeams = new ArrayList<>(teams);
        sortedTeams.sort(Collections.reverseOrder());
        System.out.println(sortedTeams);
    }
    public void printScores(){
        System.out.println(points);
    }


}

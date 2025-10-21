package ch.samt.spotournament;

import java.util.Comparator;

public class SchoolComparator implements Comparator<Team> {
    @Override
    public int compare(Team t1, Team t2) {
        return t1.getSchool().compareTo(t2.getSchool());
    }

}

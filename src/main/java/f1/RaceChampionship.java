package f1;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RaceChampionship {
    private Set<Race> races;

    public RaceChampionship(Set<Race> races) {
        this.races = races;
    }

    public RaceChampionship() {
        this.races = new HashSet<>();
    }

    public List<Race> getRacesForDriver(RacingDriver racingDriver) {
        return null;
    }


    public void addRace(Race race) {
        races.add(race);
    }

    public RaceParticipation getBestResultForDriver(RacingDriver racingDriver) {
        return null;
    }


    public RaceParticipation getWorstResultForDriver(RacingDriver racingDriver) {
        return null;
    }

    public double getAveragePointsForDriver(RacingDriver racingDriver) {
        return 0;
    }


    public Set<RacingDriver> getDriversWhoCrashed() {
        return null;
    }

    public RacingDriver getDriverWhoCrashedTheMost() {
        return null;
    }

    public Set<RacingDriver> getDriversWhoNeverCrashed() {
        return null;
    }


    public RacingDriver getDriverWithMostFastestLaps() {
        return null;
    }

    public Set<RacingDriver> getSetOfDriversWithAFastestLap() {
        return null;
    }

    public Set<RacingDriver> getSetOfAllRaceWinners() {
        return null;
    }

    public RacingDriver getDriverWithMostRaceWins() {
        return null;

    }


    public Set<RacingDriver> getDriversAboveFiftyPoints() {
        return null;
    }

    public Set<RacingDriver> getDriversWithoutAnyPoints() {
        return null;
    }


    public Map<Integer, RacingDriver> getDriversClassificationLeaderBoard() {
        return null;

    }

    public RacingDriver getDriversClassificationWinner() {
        return null;
    }

    public Map<Integer, RacingTeam> getConstructorsClassificationLeaderboard() {
        return null;


    }

    public RacingTeam getConstructorsClassificationWinner() {
        return null;
    }


}

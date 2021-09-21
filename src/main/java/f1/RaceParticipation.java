package f1;

import java.util.Set;

public class RaceParticipation {
    private Race race;
    private RacingDriver driver;
    private RacingTeam racingTeam;
    private int position;
    private Set<RaceEvent> raceEventSet;

    public RaceParticipation(Race race, RacingDriver driver, RacingTeam racingTeam, int position, Set<RaceEvent> raceEventSet) {
        this.race = race;
        this.driver = driver;
        this.racingTeam = racingTeam;
        this.position = position;
        this.raceEventSet = raceEventSet;
        raceEventSet.forEach(raceEvent -> raceEvent.setDriver(driver));
    }

    public RaceParticipation(RacingDriver driver, RacingTeam racingTeam, int position, Set<RaceEvent> raceEventSet) {
        this.driver = driver;
        this.racingTeam = racingTeam;
        this.position = position;
        this.raceEventSet = raceEventSet;
        raceEventSet.forEach(raceEvent -> raceEvent.setDriver(driver));
    }


    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public RacingDriver getDriver() {
        return driver;
    }

    public RacingTeam getRacingTeam() {
        return racingTeam;
    }

    public int getPosition() {
        return position;
    }

    public Set<RaceEvent> getRaceEventSet() {
        return raceEventSet;
    }

    public int calculatePoints() {
        int points = 0;

        if (raceEventSet.stream().filter(el -> el.getEventType().equals(RaceEventType.FASTEST_LAP)).count() > 0) {
            points++;
        }


        switch (position) {
            case 1:
                points += 25;
                break;
            case 2:
                points += 18;
                break;
            case 3:
                points += 15;
                break;
            case 4:
                points += 12;
                break;
            case 5:
                points += 10;
                break;
            case 6:
                points += 8;
                break;
            case 7:
                points += 6;
                break;
            case 8:
                points += 4;
                break;
            case 9:
                points += 2;
                break;
            case 10:
                points += 1;
                break;
        }

        return points;
    }
}

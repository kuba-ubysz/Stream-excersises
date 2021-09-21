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

    public RaceParticipation( RacingDriver driver, RacingTeam racingTeam, int position, Set<RaceEvent> raceEventSet) {
        this.driver = driver;
        this.racingTeam = racingTeam;
        this.position = position;
        this.raceEventSet = raceEventSet;
        raceEventSet.forEach(raceEvent -> raceEvent.setDriver(driver));
    }


    public Race getRace() {
        return race;
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
            case 1 -> points += 25;
            case 2 -> points += 18;
            case 3 -> points += 15;
            case 4 -> points += 12;
            case 5 -> points += 10;
            case 6 -> points += 8;
            case 7 -> points += 6;
            case 8 -> points += 4;
            case 9 -> points += 2;
            case 10 -> points += 1;
        }

        return points;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}


//1: 25
//2: 18
//3: 15
//4: 12
//5: 10
//6: 8
//7: 6
//8: 4
//9: 2
//10: 1
//11+: 0
// +1 pkt za fastest lap
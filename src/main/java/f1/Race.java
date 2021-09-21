package f1;

import java.util.HashSet;
import java.util.Set;

public class Race {
    private String name;
    private Set<RaceParticipation> participantSet;
    private RaceChampionship raceChampionship;

    public Race(String name, RaceChampionship raceChampionship) {
        this.name = name;
        this.participantSet = new HashSet<>();
        this.raceChampionship = raceChampionship;
        raceChampionship.addRace(this);
    }

    public String getName() {
        return name;
    }

    public Set<RaceParticipation> getParticipantSet() {
        return participantSet;
    }

    public RaceChampionship getRaceChampionship() {
        return raceChampionship;
    }

    public void addParticipants(Set<RaceParticipation> raceParticipations) {
        raceParticipations.forEach(el -> el.setRace(this));
        this.participantSet.addAll(raceParticipations);
    }
}

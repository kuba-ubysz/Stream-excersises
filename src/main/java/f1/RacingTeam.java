package f1;

import java.util.HashSet;
import java.util.Set;

public class RacingTeam {
    private String name;
    private Set<RacingDriver> raceDrivers;
    private Set<RacingDriver> developmentDrivers;

    public RacingTeam(String name) {
        this.name = name;
        this.raceDrivers = new HashSet<>();
        this.developmentDrivers = new HashSet<>();
    }

    public RacingTeam(String name, Set<RacingDriver> raceDrivers, Set<RacingDriver> developmentDrivers) {
        this.name = name;
        this.raceDrivers = raceDrivers;
        this.developmentDrivers = developmentDrivers;
    }
}

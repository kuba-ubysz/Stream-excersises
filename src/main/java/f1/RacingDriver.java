package f1;

public class RacingDriver {
    private String name;
    private String surname;
    private RacingTeam racingDriverFor;
    private RacingTeam developmentDriverFor;


    public RacingDriver(String name, String surname, RacingTeam racingDriverFor, RacingTeam developmentDriverFor) {
        this.name = name;
        this.surname = surname;
        this.racingDriverFor = racingDriverFor;
        this.developmentDriverFor = developmentDriverFor;
    }

    @Override
    public String toString() {
        return "RacingDriver{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }
}

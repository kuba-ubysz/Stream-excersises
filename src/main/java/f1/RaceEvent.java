package f1;

public class RaceEvent {
    private RacingDriver driver;
    private RaceEventType eventType;
    private int lap;

    public RaceEvent(RacingDriver driver, RaceEventType eventType, int lap) {
        this.driver = driver;
        this.eventType = eventType;
        this.lap = lap;
    }

    public RaceEvent(RaceEventType eventType, int lap) {
        this.eventType = eventType;
        this.lap = lap;
    }

    public RacingDriver getDriver() {
        return driver;
    }

    public RaceEventType getEventType() {
        return eventType;
    }

    public int getLap() {
        return lap;
    }

    public void setDriver(RacingDriver driver) {
        this.driver = driver;
    }
}

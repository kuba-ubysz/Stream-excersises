package f1;

public enum RaceEventType {
    FINISH("Finish"),
    DNF("DNF"),
    PIT_STOP("pit stop"),
    FASTEST_LAP("fastest lap");

    private String eventType;

    RaceEventType(String s){
        eventType = s;
    }


}

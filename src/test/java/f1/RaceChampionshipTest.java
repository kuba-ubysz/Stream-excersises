package f1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static f1.RaceEventType.*;
import static java.util.Set.of;


class RaceChampionshipTest {

    RaceChampionship formula1championshipSeason2020;
    RacingDriver lewisHamilton;
    RacingDriver georgeRussell;
    RacingDriver danielRicciardo;
    RacingDriver romainGrosjean;
    RacingDriver kevinMagnussen;
    RacingDriver valtteriBottas;
    RacingDriver sergioPerez;
    RacingDriver nicholasLatifi;
    RacingDriver landoNorris;
    RacingDriver jackAitken;

    Race austrianGP;
    Race styrianGP;
    Race hungarianGP;
    Race britishGP;
    Race anniversaryGP;
    Race belgiumGP;
    Race spanishGP;
    Race italianGP;
    Race tuscanGP;
    Race russianGP;
    Race germanGP;
    Race portualGP;
    Race emiliaRomagnaGP;
    Race turkishGP;
    Race bahrainGP;
    Race sakhirGP;
    Race abuDhabiGP;

    RacingTeam mercedes;


    @BeforeEach
    void setUp() {
        formula1championshipSeason2020 = new RaceChampionship();

        // CARS
        mercedes = new RacingTeam("Mercedes");
        var redBull = new RacingTeam("Red Bull Racing Honda");
        var mcLaren = new RacingTeam("McLaren Renault");
        var racingPoint = new RacingTeam("Racing Point BWT Mercedes");
        var renault = new RacingTeam("Renault");
        var ferrari = new RacingTeam("Ferrari");
        var alphatauriHonda = new RacingTeam("Alphatauri Honda");
        var alfaRomeo = new RacingTeam("Alfa Romeo Racing Ferrari");
        var haas = new RacingTeam("Haas Ferrari");
        var williams = new RacingTeam("Williams Mercedes");


        // DRIVERS
        valtteriBottas = new RacingDriver("Valtteri", "Bottas", mercedes, null);
        lewisHamilton = new RacingDriver("Lewis", "Hamilton", mercedes, null);
        var maxVerstappen = new RacingDriver("Max", "Verstappen", redBull, null);
        sergioPerez = new RacingDriver("Sergio", "Perez", racingPoint, null);
        danielRicciardo = new RacingDriver("Daniel", "Ricciardo", renault, null);
        var carlosSainz = new RacingDriver("Carlos", "Sainz jr.", mcLaren, null);
        var alexanderAlbon = new RacingDriver("Alexander", "Albon", redBull, null);
        var charlesLeclerc = new RacingDriver("Charles", "Leclerc", ferrari, null);
        landoNorris = new RacingDriver("Lando", "Norris", alphatauriHonda, null);
        var pierreGasly = new RacingDriver("Pierre", "Gasly", alphatauriHonda, redBull);
        var lanceStroll = new RacingDriver("Lance", "Stroll", racingPoint, null);
        var estebanOcon = new RacingDriver("Esteban", "Ocon", renault, mercedes);
        var sebVettel = new RacingDriver("Sebastian", "Vettel", ferrari, null);
        var danilKvyat = new RacingDriver("Danil", "Kvyat", alphatauriHonda, redBull);
        var nicoHulkenberg = new RacingDriver("Nico", "Hulkenberg", null, racingPoint);
        var kimiRaikkonen = new RacingDriver("Kimi", "Räikkönen", alfaRomeo, null);
        var antonioGiovinazzi = new RacingDriver("Antonio", "Giovinazzi", alfaRomeo, ferrari);
        georgeRussell = new RacingDriver("George", "Russell", williams, mercedes);
        romainGrosjean = new RacingDriver("Romain", "Grosjean", haas, null);
        kevinMagnussen = new RacingDriver("Kevin", "Magnussen", haas, null);
        nicholasLatifi = new RacingDriver("Nicholas", "Latifi", williams, null);
        jackAitken = new RacingDriver("Jack", "Aitken", null, williams);
        var pietroFittipaldi = new RacingDriver("Pietro", "Fittipaldi", null, haas);

        austrianGP = new Race("Austrian GP", formula1championshipSeason2020);
        austrianGP.getParticipantSet().addAll(of(
                new RaceParticipation(austrianGP, valtteriBottas, mercedes, 1, of(new RaceEvent(valtteriBottas, FINISH, 71))),
                new RaceParticipation(austrianGP, charlesLeclerc, ferrari, 2, of(new RaceEvent(charlesLeclerc, FINISH, 71))),
                new RaceParticipation(austrianGP, landoNorris, mcLaren, 3, of(new RaceEvent(landoNorris, FINISH, 71), new RaceEvent(landoNorris, FASTEST_LAP, 71))),
                new RaceParticipation(austrianGP, lewisHamilton, mercedes, 4, of(new RaceEvent(lewisHamilton, FINISH, 71))),
                new RaceParticipation(austrianGP, carlosSainz, mcLaren, 5, of(new RaceEvent(carlosSainz, FINISH, 71))),
                new RaceParticipation(austrianGP, sergioPerez, racingPoint, 6, of(new RaceEvent(sergioPerez, FINISH, 71))),
                new RaceParticipation(austrianGP, pierreGasly, alphatauriHonda, 7, of(new RaceEvent(pierreGasly, FINISH, 71))),
                new RaceParticipation(austrianGP, estebanOcon, renault, 8, of(new RaceEvent(estebanOcon, FINISH, 71))),
                new RaceParticipation(austrianGP, antonioGiovinazzi, alfaRomeo, 9, of(new RaceEvent(antonioGiovinazzi, FINISH, 71))),
                new RaceParticipation(austrianGP, sebVettel, ferrari, 10, of(new RaceEvent(sebVettel, FINISH, 71))),
                new RaceParticipation(austrianGP, nicholasLatifi, williams, 11, of(new RaceEvent(nicholasLatifi, FINISH, 71))),
                new RaceParticipation(austrianGP, danilKvyat, alphatauriHonda, 12, of(new RaceEvent(danilKvyat, DNF, 69))),
                new RaceParticipation(austrianGP, alexanderAlbon, redBull, 13, of(new RaceEvent(alexanderAlbon, DNF, 67))),
                new RaceParticipation(austrianGP, kimiRaikkonen, alfaRomeo, 14, of(new RaceEvent(kimiRaikkonen, DNF, 53))),
                new RaceParticipation(austrianGP, georgeRussell, williams, 15, of(new RaceEvent(georgeRussell, DNF, 49))),
                new RaceParticipation(austrianGP, romainGrosjean, haas, 16, of(new RaceEvent(romainGrosjean, DNF, 49))),
                new RaceParticipation(austrianGP, kevinMagnussen, haas, 17, of(new RaceEvent(kevinMagnussen, DNF, 24))),
                new RaceParticipation(austrianGP, lanceStroll, racingPoint, 18, of(new RaceEvent(lanceStroll, DNF, 20))),
                new RaceParticipation(austrianGP, danielRicciardo, renault, 19, of(new RaceEvent(danielRicciardo, DNF, 17))),
                new RaceParticipation(austrianGP, maxVerstappen, mercedes, 20, of(new RaceEvent(maxVerstappen, DNF, 11)))
        ));

        styrianGP = new Race("Styrian GP", formula1championshipSeason2020);
        styrianGP.getParticipantSet().addAll(of(
                new RaceParticipation(styrianGP, lewisHamilton, mercedes, 1, of(new RaceEvent(lewisHamilton, FINISH, 71))),
                new RaceParticipation(styrianGP, valtteriBottas, mercedes, 2, of(new RaceEvent(valtteriBottas, FINISH, 71))),
                new RaceParticipation(styrianGP, maxVerstappen, redBull, 3, of(new RaceEvent(maxVerstappen, FINISH, 71))),
                new RaceParticipation(styrianGP, alexanderAlbon, redBull, 4, of(new RaceEvent(alexanderAlbon, FINISH, 71))),
                new RaceParticipation(styrianGP, landoNorris, mcLaren, 5, of(new RaceEvent(landoNorris, FINISH, 71))),
                new RaceParticipation(styrianGP, sergioPerez, racingPoint, 6, of(new RaceEvent(sergioPerez, FINISH, 71))),
                new RaceParticipation(styrianGP, lanceStroll, racingPoint, 7, of(new RaceEvent(lanceStroll, FINISH, 71))),
                new RaceParticipation(styrianGP, danielRicciardo, renault, 8, of(new RaceEvent(danielRicciardo, FINISH, 71))),
                new RaceParticipation(styrianGP, carlosSainz, mcLaren, 9, of(new RaceEvent(carlosSainz, FINISH, 70), new RaceEvent(carlosSainz, FASTEST_LAP, 70))),
                new RaceParticipation(styrianGP, danilKvyat, williams, 10, of(new RaceEvent(danilKvyat, FINISH, 70))),
                new RaceParticipation(styrianGP, kimiRaikkonen, alfaRomeo, 11, of(new RaceEvent(kimiRaikkonen, FINISH, 70))),
                new RaceParticipation(styrianGP, kevinMagnussen, haas, 12, of(new RaceEvent(kevinMagnussen, FINISH, 70))),
                new RaceParticipation(styrianGP, romainGrosjean, haas, 13, of(new RaceEvent(romainGrosjean, FINISH, 70))),
                new RaceParticipation(styrianGP, antonioGiovinazzi, alfaRomeo, 14, of(new RaceEvent(antonioGiovinazzi, FINISH, 70))),
                new RaceParticipation(styrianGP, pierreGasly, alphatauriHonda, 15, of(new RaceEvent(pierreGasly, FINISH, 70))),
                new RaceParticipation(styrianGP, georgeRussell, williams, 16, of(new RaceEvent(georgeRussell, FINISH, 69))),
                new RaceParticipation(styrianGP, nicholasLatifi, williams, 17, of(new RaceEvent(nicholasLatifi, FINISH, 69))),
                new RaceParticipation(styrianGP, estebanOcon, renault, 18, of(new RaceEvent(estebanOcon, DNF, 25))),
                new RaceParticipation(styrianGP, charlesLeclerc, ferrari, 19, of(new RaceEvent(charlesLeclerc, DNF, 4))),
                new RaceParticipation(styrianGP, sebVettel, ferrari, 20, of(new RaceEvent(sebVettel, DNF, 1)))
        ));

        hungarianGP = new Race("Hungarian GP", formula1championshipSeason2020);
        hungarianGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 70), new RaceEvent(FASTEST_LAP, 70))),
                new RaceParticipation(maxVerstappen, redBull, 2, of(new RaceEvent(FINISH, 70))),
                new RaceParticipation(valtteriBottas, mercedes, 3, of(new RaceEvent(FINISH, 70))),
                new RaceParticipation(lanceStroll, mcLaren, 4, of(new RaceEvent(FINISH, 70))),
                new RaceParticipation(alexanderAlbon, redBull, 5, of(new RaceEvent(FINISH, 70))),
                new RaceParticipation(sebVettel, ferrari, 6, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(sergioPerez, racingPoint, 7, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(danielRicciardo, renault, 8, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(carlosSainz, mcLaren, 9, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(kevinMagnussen, haas, 10, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(charlesLeclerc, ferrari, 11, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 12, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(landoNorris, mcLaren, 13, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(estebanOcon, renault, 14, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 15, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(romainGrosjean, haas, 16, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 17, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(georgeRussell, williams, 18, of(new RaceEvent(FINISH, 69))),
                new RaceParticipation(nicholasLatifi, williams, 19, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 20, of(new RaceEvent(DNF, 15)))
        ));

        britishGP = new Race("British GP", formula1championshipSeason2020);
        britishGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(maxVerstappen, redBull, 2, of(new RaceEvent(FINISH, 52), new RaceEvent(FASTEST_LAP, 52))),
                new RaceParticipation(charlesLeclerc, ferrari, 3, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(danielRicciardo, renault, 4, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(landoNorris, mcLaren, 5, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(estebanOcon, ferrari, 6, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 7, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(alexanderAlbon, redBull, 8, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(lanceStroll, racingPoint, 9, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(sebVettel, ferrari, 10, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(valtteriBottas, mercedes, 11, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(georgeRussell, williams, 12, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(carlosSainz, mcLaren, 13, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 14, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(nicholasLatifi, williams, 15, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(romainGrosjean, haas, 16, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 17, of(new RaceEvent(FINISH, 51))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 18, of(new RaceEvent(DNF, 11))),
                new RaceParticipation(kevinMagnussen, haas, 19, of(new RaceEvent(DNF, 1))),
                new RaceParticipation(nicoHulkenberg, racingPoint, 20, of(new RaceEvent(DNF, 0)))
        ));

        anniversaryGP = new Race("70th Anniversary GP", formula1championshipSeason2020);
        anniversaryGP.addParticipants(of(
                new RaceParticipation(maxVerstappen, redBull, 1, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(lewisHamilton, mercedes, 2, of(new RaceEvent(FINISH, 52), new RaceEvent(FASTEST_LAP, 52))),
                new RaceParticipation(valtteriBottas, mercedes, 3, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(charlesLeclerc, ferrari, 4, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(alexanderAlbon, redBull, 5, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(lanceStroll, racingPoint, 6, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(nicoHulkenberg, racingPoint, 7, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(estebanOcon, renault, 8, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(landoNorris, mcLaren, 9, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 10, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 11, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(sebVettel, ferrari, 12, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(carlosSainz, mcLaren, 13, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(danielRicciardo, renault, 14, of(new RaceEvent(FINISH, 51))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 15, of(new RaceEvent(FINISH, 51))),
                new RaceParticipation(romainGrosjean, haas, 16, of(new RaceEvent(FINISH, 51))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 17, of(new RaceEvent(FINISH, 51))),
                new RaceParticipation(georgeRussell, williams, 18, of(new RaceEvent(FINISH, 51))),
                new RaceParticipation(nicholasLatifi, williams, 19, of(new RaceEvent(FINISH, 51))),
                new RaceParticipation(kevinMagnussen, haas, 20, of(new RaceEvent(DNF, 43)))
        ));

        spanishGP = new Race("Spain GP", formula1championshipSeason2020);
        spanishGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 66))),
                new RaceParticipation(maxVerstappen, redBull, 2, of(new RaceEvent(FINISH, 66))),
                new RaceParticipation(valtteriBottas, mercedes, 3, of(new RaceEvent(FINISH, 66), new RaceEvent(FASTEST_LAP, 66))),
                new RaceParticipation(lanceStroll, racingPoint, 4, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(sergioPerez, racingPoint, 5, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(carlosSainz, mcLaren, 6, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(sebVettel, ferrari, 7, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(alexanderAlbon, redBull, 8, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 9, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(landoNorris, mcLaren, 10, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(danielRicciardo, renault, 11, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 12, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(estebanOcon, renault, 13, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 14, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(kevinMagnussen, haas, 15, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 16, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(georgeRussell, williams, 17, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(nicholasLatifi, williams, 18, of(new RaceEvent(FINISH, 64))),
                new RaceParticipation(romainGrosjean, haas, 19, of(new RaceEvent(FINISH, 64))),
                new RaceParticipation(charlesLeclerc, ferrari, 20, of(new RaceEvent(DNF, 38)))
        ));

        belgiumGP = new Race("Belgian GP", formula1championshipSeason2020);
        belgiumGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(valtteriBottas, mercedes, 2, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(maxVerstappen, redBull, 3, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(danielRicciardo, renault, 4, of(new RaceEvent(FINISH, 44), new RaceEvent(FASTEST_LAP, 44))),
                new RaceParticipation(estebanOcon, renault, 5, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(alexanderAlbon, redBull, 6, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(landoNorris, mcLaren, 7, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 8, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(lanceStroll, racingPoint, 9, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(sergioPerez, racingPoint, 10, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 11, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 12, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(sebVettel, ferrari, 13, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(charlesLeclerc, ferrari, 14, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(romainGrosjean, haas, 15, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(nicholasLatifi, williams, 16, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(kevinMagnussen, haas, 17, of(new RaceEvent(FINISH, 44))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 18, of(new RaceEvent(DNF, 9))),
                new RaceParticipation(georgeRussell, williams, 19, of(new RaceEvent(DNF, 9))),
                new RaceParticipation(carlosSainz, mcLaren, 20, of(new RaceEvent(DNF, 0)))
        ));
        italianGP = new Race("Italian GP", formula1championshipSeason2020);
        italianGP.addParticipants(of(
                new RaceParticipation(pierreGasly, alphatauriHonda, 1, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(carlosSainz, mcLaren, 2, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(lanceStroll, racingPoint, 3, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(landoNorris, mcLaren, 4, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(valtteriBottas, mercedes, 5, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(danielRicciardo, renault, 6, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(lewisHamilton, mercedes, 7, of(new RaceEvent(FINISH, 53), new RaceEvent(FASTEST_LAP, 53))),
                new RaceParticipation(estebanOcon, renault, 8, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 9, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(sergioPerez, racingPoint, 10, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(nicholasLatifi, williams, 11, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(romainGrosjean, haas, 12, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 13, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(georgeRussell, williams, 14, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(alexanderAlbon, redBull, 15, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 16, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(maxVerstappen, redBull, 17, of(new RaceEvent(DNF, 30))),
                new RaceParticipation(charlesLeclerc, ferrari, 18, of(new RaceEvent(DNF, 23))),
                new RaceParticipation(kevinMagnussen, haas, 19, of(new RaceEvent(DNF, 17))),
                new RaceParticipation(sebVettel, ferrari, 20, of(new RaceEvent(DNF, 6)))
        ));

        tuscanGP = new Race("Tuscan GP", formula1championshipSeason2020);
        tuscanGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 59), new RaceEvent(FASTEST_LAP, 59))),
                new RaceParticipation(valtteriBottas, mercedes, 2, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(alexanderAlbon, redBull, 3, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(danielRicciardo, renault, 4, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(sergioPerez, racingPoint, 5, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(landoNorris, mcLaren, 6, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 7, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(charlesLeclerc, ferrari, 8, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 9, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(sebVettel, ferrari, 10, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(georgeRussell, williams, 11, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(romainGrosjean, haas, 12, of(new RaceEvent(FINISH, 59))),
                new RaceParticipation(lanceStroll, racingPoint, 13, of(new RaceEvent(DNF, 42))),
                new RaceParticipation(estebanOcon, renault, 14, of(new RaceEvent(DNF, 7))),
                new RaceParticipation(nicholasLatifi, williams, 15, of(new RaceEvent(DNF, 6))),
                new RaceParticipation(kevinMagnussen, haas, 16, of(new RaceEvent(DNF, 5))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 17, of(new RaceEvent(DNF, 5))),
                new RaceParticipation(carlosSainz, mcLaren, 18, of(new RaceEvent(DNF, 5))),
                new RaceParticipation(maxVerstappen, redBull, 19, of(new RaceEvent(DNF, 0))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 20, of(new RaceEvent(DNF, 0)))
        ));


        russianGP = new Race("Russian GP", formula1championshipSeason2020);
        russianGP.addParticipants(of(
                new RaceParticipation(valtteriBottas, mercedes, 1, of(new RaceEvent(FINISH, 53), new RaceEvent(FASTEST_LAP, 53))),
                new RaceParticipation(maxVerstappen, redBull, 2, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(lewisHamilton, mercedes, 3, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(sergioPerez, racingPoint, 4, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(danielRicciardo, renault, 5, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(charlesLeclerc, ferrari, 6, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(estebanOcon, renault, 7, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 8, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 9, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(alexanderAlbon, redBull, 10, of(new RaceEvent(FINISH, 53))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 11, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(kevinMagnussen, haas, 12, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(sebVettel, ferrari, 13, of(new RaceEvent(FINISH, 42))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 14, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(landoNorris, mcLaren, 15, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(nicholasLatifi, williams, 16, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(romainGrosjean, haas, 17, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(georgeRussell, williams, 18, of(new RaceEvent(FINISH, 52))),
                new RaceParticipation(carlosSainz, mcLaren, 19, of(new RaceEvent(FINISH, 0))),
                new RaceParticipation(lanceStroll, racingPoint, 20, of(new RaceEvent(DNF, 0)))
        ));


        germanGP = new Race("German GP", formula1championshipSeason2020);
        germanGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 60), new RaceEvent(FASTEST_LAP, 60))),
                new RaceParticipation(maxVerstappen, redBull, 2, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(danielRicciardo, renault, 3, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(sergioPerez, racingPoint, 4, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(carlosSainz, mcLaren, 5, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 6, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(charlesLeclerc, ferrari, 7, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(nicoHulkenberg, racingPoint, 8, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(romainGrosjean, haas, 9, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 10, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(sebVettel, ferrari, 11, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 12, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(kevinMagnussen, haas, 13, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(nicholasLatifi, williams, 14, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 15, of(new RaceEvent(FINISH, 60))),
                new RaceParticipation(landoNorris, mcLaren, 16, of(new RaceEvent(DNF, 42))),
                new RaceParticipation(alexanderAlbon, redBull, 17, of(new RaceEvent(DNF, 23))),
                new RaceParticipation(estebanOcon, renault, 18, of(new RaceEvent(DNF, 22))),
                new RaceParticipation(valtteriBottas, mercedes, 19, of(new RaceEvent(DNF, 18))),
                new RaceParticipation(georgeRussell, williams, 20, of(new RaceEvent(DNF, 12)))
        ));

        portualGP = new Race("Portugal GP", formula1championshipSeason2020);
        portualGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 66), new RaceEvent(FASTEST_LAP, 66))),
                new RaceParticipation(valtteriBottas, mercedes, 2, of(new RaceEvent(FINISH, 66))),
                new RaceParticipation(maxVerstappen, redBull, 3, of(new RaceEvent(FINISH, 66))),
                new RaceParticipation(charlesLeclerc, ferrari, 4, of(new RaceEvent(FINISH, 66))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 5, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(carlosSainz, mcLaren, 6, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(sergioPerez, racingPoint, 7, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(estebanOcon, renault, 8, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(danielRicciardo, renault, 9, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(sebVettel, ferrari, 10, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 11, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(alexanderAlbon, redBull, 12, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(landoNorris, mcLaren, 13, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(georgeRussell, williams, 14, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 15, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(kevinMagnussen, haas, 16, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(romainGrosjean, haas, 17, of(new RaceEvent(FINISH, 65))),
                new RaceParticipation(nicholasLatifi, williams, 18, of(new RaceEvent(FINISH, 64))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 19, of(new RaceEvent(FINISH, 64))),
                new RaceParticipation(lanceStroll, racingPoint, 20, of(new RaceEvent(DNF, 51)))
        ));

        emiliaRomagnaGP = new Race("Emilia Romagna GP", formula1championshipSeason2020);
        emiliaRomagnaGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 63), new RaceEvent(FASTEST_LAP, 63))),
                new RaceParticipation(valtteriBottas, mercedes, 2, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(danielRicciardo, renault, 3, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 4, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(charlesLeclerc, ferrari, 5, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(sergioPerez, racingPoint, 6, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(carlosSainz, mcLaren, 7, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(landoNorris, mcLaren, 8, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 9, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 10, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(nicholasLatifi, williams, 11, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(sebVettel, ferrari, 12, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(lanceStroll, racingPoint, 13, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(romainGrosjean, haas, 14, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(alexanderAlbon, redBull, 15, of(new RaceEvent(FINISH, 63))),
                new RaceParticipation(georgeRussell, williams, 16, of(new RaceEvent(DNF, 51))),
                new RaceParticipation(maxVerstappen, redBull, 17, of(new RaceEvent(DNF, 50))),
                new RaceParticipation(kevinMagnussen, haas, 18, of(new RaceEvent(DNF, 47))),
                new RaceParticipation(estebanOcon, renault, 19, of(new RaceEvent(DNF, 27))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 20, of(new RaceEvent(DNF, 8)))
        ));


        turkishGP = new Race("Turkish GP", formula1championshipSeason2020);
        turkishGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 58))),
                new RaceParticipation(sergioPerez, redBull, 2, of(new RaceEvent(FINISH, 58))),
                new RaceParticipation(sebVettel, ferrari, 3, of(new RaceEvent(FINISH, 58))),
                new RaceParticipation(charlesLeclerc, ferrari, 4, of(new RaceEvent(FINISH, 58))),
                new RaceParticipation(carlosSainz, mcLaren, 5, of(new RaceEvent(FINISH, 58))),
                new RaceParticipation(maxVerstappen, redBull, 6, of(new RaceEvent(FINISH, 58))),
                new RaceParticipation(alexanderAlbon, redBull, 7, of(new RaceEvent(FINISH, 58))),
                new RaceParticipation(landoNorris, mcLaren, 8, of(new RaceEvent(FINISH, 58), new RaceEvent(FASTEST_LAP, 58))),
                new RaceParticipation(lanceStroll, racingPoint, 9, of(new RaceEvent(FINISH, 58))),
                new RaceParticipation(danielRicciardo, renault, 10, of(new RaceEvent(FINISH, 58))),
                new RaceParticipation(estebanOcon, renault, 11, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 12, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 13, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(valtteriBottas, mercedes, 14, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 15, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(georgeRussell, williams, 16, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(kevinMagnussen, haas, 17, of(new RaceEvent(DNF, 55))),
                new RaceParticipation(romainGrosjean, haas, 18, of(new RaceEvent(DNF, 49))),
                new RaceParticipation(nicholasLatifi, williams, 19, of(new RaceEvent(DNF, 39))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 20, of(new RaceEvent(DNF, 11)))
        ));

        bahrainGP = new Race("Bahrain GP", formula1championshipSeason2020);
        bahrainGP.addParticipants(of(
                new RaceParticipation(lewisHamilton, mercedes, 1, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(maxVerstappen, redBull, 2, of(new RaceEvent(FINISH, 57), new RaceEvent(FASTEST_LAP, 57))),
                new RaceParticipation(alexanderAlbon, redBull, 3, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(landoNorris, mcLaren, 4, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(carlosSainz, mcLaren, 5, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 6, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(danielRicciardo, renault, 7, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(valtteriBottas, mercedes, 8, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(estebanOcon, renault, 9, of(new RaceEvent(FINISH, 57))),
                new RaceParticipation(charlesLeclerc, ferrari, 10, of(new RaceEvent(FINISH, 56))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 11, of(new RaceEvent(FINISH, 56))),
                new RaceParticipation(georgeRussell, williams, 12, of(new RaceEvent(FINISH, 56))),
                new RaceParticipation(sebVettel, ferrari, 13, of(new RaceEvent(FINISH, 56))),
                new RaceParticipation(nicholasLatifi, williams, 14, of(new RaceEvent(FINISH, 56))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 15, of(new RaceEvent(FINISH, 56))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 16, of(new RaceEvent(FINISH, 56))),
                new RaceParticipation(kevinMagnussen, haas, 17, of(new RaceEvent(FINISH, 56))),
                new RaceParticipation(sergioPerez, racingPoint, 18, of(new RaceEvent(DNF, 53))),
                new RaceParticipation(lanceStroll, racingPoint, 19, of(new RaceEvent(DNF, 2))),
                new RaceParticipation(romainGrosjean, haas, 20, of(new RaceEvent(DNF, 0)))
        ));

        sakhirGP = new Race("Sakhir GP", formula1championshipSeason2020);
        sakhirGP.addParticipants(of(
                new RaceParticipation(sergioPerez, redBull, 1, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(estebanOcon, renault, 2, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(lanceStroll, racingPoint, 3, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(carlosSainz, mcLaren, 4, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(danielRicciardo, renault, 5, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(alexanderAlbon, redBull, 6, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(danilKvyat, alphatauriHonda, 7, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(valtteriBottas, mercedes, 8, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(georgeRussell, mercedes, 9, of(new RaceEvent(FINISH, 87), new RaceEvent(FASTEST_LAP, 87))),
                new RaceParticipation(landoNorris, mcLaren, 10, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(pierreGasly, alphatauriHonda, 11, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(sebVettel, ferrari, 12, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(antonioGiovinazzi, alfaRomeo, 13, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(kimiRaikkonen, alfaRomeo, 14, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(kevinMagnussen, haas, 15, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(jackAitken, williams, 16, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(pietroFittipaldi, haas, 17, of(new RaceEvent(FINISH, 87))),
                new RaceParticipation(nicholasLatifi, williams, 18, of(new RaceEvent(DNF, 52))),
                new RaceParticipation(maxVerstappen, redBull, 19, of(new RaceEvent(DNF, 0))),
                new RaceParticipation(charlesLeclerc, ferrari, 20, of(new RaceEvent(DNF, 0)))
        ));

        abuDhabiGP = new Race("Abu Dhabi GP", formula1championshipSeason2020);
        abuDhabiGP.addParticipants(of(
                new RaceParticipation(maxVerstappen, redBull, 1, of(new RaceEvent(FINISH, 55))),
                new RaceParticipation(valtteriBottas, mercedes, 2, of(new RaceEvent(FINISH, 55))),
                new RaceParticipation(lewisHamilton, mercedes, 3, of(new RaceEvent(FINISH, 55))),
                new RaceParticipation(alexanderAlbon,redBull, 4, of(new RaceEvent(FINISH, 55))),
                new RaceParticipation(landoNorris,mcLaren, 5, of(new RaceEvent(FINISH, 55))),
                new RaceParticipation(carlosSainz,mcLaren, 6, of(new RaceEvent(FINISH, 55))),
                new RaceParticipation(danielRicciardo,renault, 7, of(new RaceEvent(FINISH, 55), new RaceEvent(FASTEST_LAP, 55))),
                new RaceParticipation(pierreGasly,alphatauriHonda, 8, of(new RaceEvent(FINISH, 55))),
                new RaceParticipation(estebanOcon,renault, 9, of(new RaceEvent(FINISH, 55))),
                new RaceParticipation(lanceStroll,racingPoint, 10, of(new RaceEvent(FINISH, 55))),
                new RaceParticipation(danilKvyat,alphatauriHonda, 11, of(new RaceEvent(FINISH, 54))),
                new RaceParticipation(kimiRaikkonen,alfaRomeo, 12, of(new RaceEvent(FINISH, 54))),
                new RaceParticipation(charlesLeclerc,ferrari, 13, of(new RaceEvent(FINISH, 54))),
                new RaceParticipation(sebVettel,ferrari, 14, of(new RaceEvent(FINISH, 54))),
                new RaceParticipation(georgeRussell,williams, 15, of(new RaceEvent(FINISH, 54))),
                new RaceParticipation(antonioGiovinazzi,alfaRomeo, 16, of(new RaceEvent(FINISH, 54))),
                new RaceParticipation(nicholasLatifi,williams, 17, of(new RaceEvent(FINISH, 54))),
                new RaceParticipation(kevinMagnussen,haas, 18, of(new RaceEvent(FINISH, 54))),
                new RaceParticipation(pietroFittipaldi,haas, 19, of(new RaceEvent(DNF, 53))),
                new RaceParticipation(sergioPerez, racingPoint, 20, of(new RaceEvent(DNF, 8)))
        ));



    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void shouldGetRacesForDriver() {
        //given
        var testedDriver = georgeRussell;
        //when
        var racesForDriver = formula1championshipSeason2020.getRacesForDriver(testedDriver);
        //then
        Assertions.assertEquals(17, racesForDriver.size(), "Expected race amount not equal to ");
    }

    @Test
    public void shouldGetBestResultForDriver() {
        //given
        var testedDriver = georgeRussell;
        //when
        RaceParticipation bestResultForDriver = formula1championshipSeason2020.getBestResultForDriver(testedDriver);
        //then
        Assertions.assertEquals(9, bestResultForDriver.getPosition());
        Assertions.assertEquals(sakhirGP, bestResultForDriver.getRace());

    }

    @Test
    public void shouldGetWorstResultForDriver() {
        //given
        var testedDriver = lewisHamilton;
        //when
        RaceParticipation worstResultForDriver = formula1championshipSeason2020.getWorstResultForDriver(testedDriver);
        //then
        Assertions.assertEquals(7, worstResultForDriver.getPosition());
        Assertions.assertEquals(italianGP, worstResultForDriver.getRace());
    }

    @Test
    public void shouldGetAveragePointsForDriver() {
        //given
        var testedDriver = lewisHamilton;
        //when
        double averagePointsForDriver = formula1championshipSeason2020.getAveragePointsForDriver(testedDriver);
        //then
        Assertions.assertEquals(21.75, averagePointsForDriver);
    }

    @Test
    public void shouldGetDriversWhoCrashed() {
        //given
        //when
        Set<RacingDriver> driversWhoCrashed = formula1championshipSeason2020.getDriversWhoCrashed();
        //then
        Assertions.assertEquals(21, driversWhoCrashed.size());
    }

    @Test
    public void shouldGetDriverWhoCrashedTheMost() {
        //given
        var testedDriver = kevinMagnussen;
        //when
        RacingDriver driverWhoCrashedTheMost = formula1championshipSeason2020.getDriverWhoCrashedTheMost();
        //then
        Assertions.assertEquals(testedDriver, driverWhoCrashedTheMost);
    }

    @Test
    public void shouldGetDriversWhoNeverCrashed() {
        //given
        RacingDriver testedDriver1 = lewisHamilton;
        RacingDriver testedDriver2 = jackAitken;
        //when
        Set<RacingDriver> getDriversWhoNeverCrashed = formula1championshipSeason2020.getDriversWhoNeverCrashed();
        System.out.println(getDriversWhoNeverCrashed);
        //then
        Assertions.assertEquals(2, getDriversWhoNeverCrashed.size());
        Assertions.assertTrue(getDriversWhoNeverCrashed.contains(testedDriver1));
        Assertions.assertTrue(getDriversWhoNeverCrashed.contains(testedDriver2));
    }

    @Test
    public void shouldGetDriverWithMostFastestLaps() {
        //given
        RacingDriver testedDriver = lewisHamilton;
        //when
        RacingDriver driverWithMostFastestLaps = formula1championshipSeason2020.getDriverWithMostFastestLaps();
        //then
        Assertions.assertEquals(testedDriver, driverWithMostFastestLaps);
    }

    @Test
    public void shouldGetSetOfDriversWithAFastestLap() {
        //given
        //when
        Set<RacingDriver> setOfDriversWithAFastestLap = formula1championshipSeason2020.getSetOfDriversWithAFastestLap();
        //then
        Assertions.assertEquals(7, setOfDriversWithAFastestLap.size());
    }

    @Test
    public void shouldGetSetOfAllRaceWinners() {
        //given
        //when
        Set<RacingDriver> setOfAllRaceWinners = formula1championshipSeason2020.getSetOfAllRaceWinners();
        //then
        Assertions.assertEquals(5, setOfAllRaceWinners.size());
    }

    @Test
    public void shouldGetDriverWithMostRaceWins() {
        //given
        RacingDriver testedDriver = lewisHamilton;
        //when
        RacingDriver driverWithMostRaceWins = formula1championshipSeason2020.getDriverWithMostRaceWins();
        //then
        Assertions.assertEquals(testedDriver, driverWithMostRaceWins);
    }

    @Test
    public void shouldGetDriversAboveFiftyPoints() {
        //given
        //when
        Set<RacingDriver> driversAboveFiftyPoints = formula1championshipSeason2020.getDriversAboveFiftyPoints();
        //then
        Assertions.assertEquals(12, driversAboveFiftyPoints.size());
    }

    @Test
    public void shouldGetDriversWithoutAnyPoints() {
        //given
        //when
        Set<RacingDriver> driversWithoutAnyPoints = formula1championshipSeason2020.getDriversWithoutAnyPoints();
        //then
        Assertions.assertEquals(3, driversWithoutAnyPoints.size());
    }

    @Test
    public void shouldGetDriversClassificationLeaderBoard() {
        //given
        RacingDriver testedDriver = lewisHamilton;
        //when
        Map<Integer, RacingDriver> driversClassificationLeaderBoard = formula1championshipSeason2020.getDriversClassificationLeaderBoard();
        //then
        // 21 because 2 of 23 haven't been participating
        Assertions.assertEquals(23, driversClassificationLeaderBoard.size());
        Assertions.assertEquals(testedDriver, driversClassificationLeaderBoard.get(1));
    }

    @Test
    public void shouldGetDriversClassificationWinner() {
        //given
        RacingDriver testedDriver = lewisHamilton;
        //when
        RacingDriver driversClassificationWinner = formula1championshipSeason2020.getDriversClassificationWinner();
        //then
        Assertions.assertEquals(testedDriver, driversClassificationWinner);
    }

    @Test
    public void shouldGetConstructorsClassificationLeaderboard() {
        //given
        RacingTeam testedConstructor = mercedes;
        //when
        Map<Integer, RacingTeam> constructorsClassificationLeaderboard = formula1championshipSeason2020.getConstructorsClassificationLeaderboard();
        //then
        Assertions.assertEquals(10, constructorsClassificationLeaderboard.size());
        Assertions.assertEquals(testedConstructor, constructorsClassificationLeaderboard.get(1));
    }

    @Test
    public void shouldGetConstructorsClassificationWinner() {
        //given
        RacingTeam testedConstructor = mercedes;
        //when
        RacingTeam constructorsClassificationWinner = formula1championshipSeason2020.getConstructorsClassificationWinner();
        //then
        Assertions.assertEquals(testedConstructor, constructorsClassificationWinner);
    }


}
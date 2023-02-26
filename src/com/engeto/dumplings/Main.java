package com.engeto.dumplings;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Patri k lekci 2 - cviceni k vykladu teorie
 */
public class Main {

    private static void racersNames(Race race) {
        for (Racer racer : race.getRacers()) {
            System.out.println(racer);
        }
    }

    public static void main(String[] args) {
//        Racer firstRacer = new Racer();
//        Racer secondRacer = new Racer();

        List<Race> racesDB = new ArrayList<>();

        Race race2017 = new Race(2017);
        Race race2018 = new Race(2018);
        Race race2019 = new Race(2019);

        racesDB.add(race2017);
        racesDB.add(race2018);
        racesDB.add(race2019);
        for (Race race : racesDB) {
            System.out.println(race.getYear());
        }

        race2018.addRacer(new Racer("James", LocalDate.of(1975, 10, 4)));
        race2018.addRacer(new Racer("John", LocalDate.of(1965, 3, 6)));
        race2018.addRacer(new Racer("Jim", LocalDate.of(1966, 6, 5)));
        race2018.addRacer(new Racer("John Jameson", LocalDate.of(1976, 5, 9)));
        race2018.addRacer(new Racer("James Johnson", LocalDate.of(1976, 5, 8)));

        racersNames(race2018);
        race2018.removeRacer(2);
        System.out.println("--------");
        racersNames(race2018);

//        firstRacer.setName("Karel");
//        System.out.println(firstRacer.getName());
//        secondRacer.setName("Jana");
//        System.out.println(secondRacer.getName());
//
//        Racer chuck = new Racer("Chuck Norris", LocalDate.of(1956, 8, 11), 100);
//
//        String chucksName = chuck.getName();
//        System.out.println(chuck.getNumberOfDumplings());

//        Race todaysRace = new Race(2020, "MČR Břicháč Cup", LocalDate.of(2020, 10, 27));
//
//        // ...a nakonec stejne zvitezil nekdo jiny, nez Chuck.
//        Racer stranger = new Racer();
//        stranger.setName("Charles");
//        todaysRace.setWinner(stranger);
    }
}

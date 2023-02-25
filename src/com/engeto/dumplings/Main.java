package com.engeto.dumplings;

import java.time.LocalDate;

/**
 * Patri k lekci 2.3 - vyklad teorie.
 */
public class Main {

    // protoze jsme vytvorili konstruktor, tato metoda se stala zbytecnou
//    private static Racer createRacer(
//            String name, LocalDate born, int numberOfDumplins, boolean finalResult ) {
//        Racer newRacer = new Racer();
//        newRacer.setName(name);
//        newRacer.setBorn(born);
//        newRacer.setNumberOfDumplings(numberOfDumplins);
//        newRacer.setFinalResult(finalResult);
//
//        return newRacer;
//    }

    public static void main(String[] args) {
        Racer firstRacer = new Racer();
        Racer secondRacer = new Racer();

        Racer race2017 = new Racer();
        Racer race2018 = new Racer();
        Racer race2019 = new Racer();

        firstRacer.setName("Karel");
        System.out.println(firstRacer.getName());
        secondRacer.setName("Jana");
        System.out.println(secondRacer.getName());

        Racer chuck = new Racer("Chuck Norris", LocalDate.of(1956, 8, 11), 100);

        String chucksName = chuck.getName();
        System.out.println(chuck.getNumberOfDumplings());

        Race todaysRace = new Race(2020, "MČR Břicháč Cup", LocalDate.of(2020, 10, 27));
        // je hotovy konstruktor (radek vys), takze toto uz neni zapotrebi
//        todaysRace.setYear(2020);
//        todaysRace.setTitle("MČR Břicháč Cup");
//        todaysRace.setDate(LocalDate.of(2020, 10, 27));

        // ...a nakonec stejne zvitezil nekdo jiny, nez Chuck.
        Racer stranger = new Racer();
        stranger.setName("Charles");
        todaysRace.setWinner(stranger);
    }
}

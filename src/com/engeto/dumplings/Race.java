package com.engeto.dumplings;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Race {
    private int year;
    private String title;
    private LocalDate date;
    private Racer winner;
    private ArrayList<Racer> listOfRacers = new ArrayList<>();

    public Race(int year, String title, LocalDate date) {
        this.year = year;
        this.title = title;
        this.date = date;
        this.winner = null;
    }

    public Race(int year, String title) {
        this(year, title, LocalDate.now());
    }

    public Race(int year) {
        this(year, "Slivkovy Knedlik Cup ;)");
    }

    public Race() {
        this(2022);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Racer getWinner() {
        return winner;
    }

    public void setWinner(Racer winner) {
        this.winner = winner;
    }

    public void addRacer(Racer newRacer) {
        this.listOfRacers.add(newRacer);
    }

    public void removeRacer(int racerIndex) {
        this.listOfRacers.remove(racerIndex);
    }

    public ArrayList<Racer> getRacers() {
        ArrayList<Racer> copyOfRacers = new ArrayList<Racer>(this.listOfRacers);
        return copyOfRacers;
    }
}

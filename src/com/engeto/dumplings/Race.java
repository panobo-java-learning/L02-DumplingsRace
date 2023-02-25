package com.engeto.dumplings;

import java.time.LocalDate;

public class Race {
    int year;
    String title;
    LocalDate date;
    Racer winner;

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
}

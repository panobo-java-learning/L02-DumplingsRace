package com.engeto.dumplings;

import java.time.LocalDate;

public class Racer {
    String name;
    int numberOfDumplings;
    boolean isFinalResult;
    LocalDate born;

    public Racer(String name, LocalDate born, int numberOfDumplings) {
        this.name = name;
        this.born = born;
        this.numberOfDumplings = numberOfDumplings;
    }

    public Racer(String name, LocalDate born) {
        this(name, born, 0);
    }

    public Racer() {
        this("Anonymous Super Eater", LocalDate.MIN);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfDumplings() {
        return numberOfDumplings;
    }

    public void setNumberOfDumplings(int numberOfDumplings) {
        this.numberOfDumplings = numberOfDumplings;
    }

    public boolean isFinalResult() {
        return isFinalResult;
    }

    public void setFinalResult(boolean finalResult) {
        isFinalResult = finalResult;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public int addDumplings(int howMuch) {
        this.numberOfDumplings += howMuch;
        return this.numberOfDumplings;
    }
}

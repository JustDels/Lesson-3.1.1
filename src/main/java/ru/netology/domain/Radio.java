package ru.netology.domain;

public class Radio {
    private final int maxVolume = 10;
    private final int minVolume = 0;
    private int currentVolume = 5;
    private final int lastRadioStation = 9;
    private final int firstRadioStation = 0;
    private int currentRadioStation = 5;

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > lastRadioStation) {
            return;
        }
        if (currentRadioStation < firstRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < lastRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = firstRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == firstRadioStation) {
            currentRadioStation = lastRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
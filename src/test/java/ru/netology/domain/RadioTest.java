package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void switchingToNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.nextRadioStation();

        assertEquals(rad.getFirstRadioStation(), rad.getCurrentRadioStation());
    }

    @Test
    public void switchingToNextRadioStationOn50() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(50);

        rad.nextRadioStation();

        assertEquals(1, rad.getCurrentRadioStation());
    }

    @Test
    public void switchingToPrevRadioStationOn55() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(55);

        rad.prevRadioStation();

        assertEquals(rad.getLastRadioStation(), rad.getCurrentRadioStation());
    }

    @Test
    public void switchingToPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);

        rad.prevRadioStation();

        assertEquals(4, rad.getCurrentRadioStation());
    }

    @Test
    public void switchingRadioStations() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);

        assertEquals(8, rad.getCurrentRadioStation());
    }

    @Test
    public void switchingRadioStationOnMinus50() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-50);

        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void changingVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        assertEquals(5, rad.getCurrentVolume());
    }

    @Test
    public void changingVolumeOn15() {
        Radio rad = new Radio();
        rad.setCurrentVolume(15);

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void turnUpVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.increaseVolume();

        assertEquals(rad.getMaxVolume(), rad.getCurrentVolume());
    }

    @Test
    public void turnUpVolumeOn10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        assertEquals(rad.getMaxVolume(), rad.getCurrentVolume());
    }

    @Test
    public void turnUpVolumeOn50() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);

        rad.increaseVolume();

        assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    public void turnUpVolumeOnMinus50() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-50);

        rad.increaseVolume();

        assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    public void turnDownVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.turnDownVolume();

        assertEquals(4, rad.getCurrentVolume());
    }

    @Test
    public void turnDownVolumeOn50() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);

        rad.turnDownVolume();

        assertEquals(rad.getMinVolume(), rad.getCurrentVolume());
    }
}
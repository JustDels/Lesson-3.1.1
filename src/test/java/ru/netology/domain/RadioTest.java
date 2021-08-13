package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void switchingToThe8thRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        assertEquals(8, rad.getCurrentRadioStation());
    }

    @Test
    public void switchingToThe9thRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        assertEquals(rad.getLastRadioStation(), rad.getCurrentRadioStation());
    }

    @Test
    public void switchingToThe10thRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        assertEquals(5, rad.getCurrentRadioStation());
    }

    @Test
    public void switchingToTheMinus1thRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        assertEquals(5, rad.getCurrentRadioStation());
    }

    @Test
    public void switchingToNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);

        rad.nextRadioStation();

        assertEquals(rad.getLastRadioStation(), rad.getCurrentRadioStation());
    }

    @Test
    public void switchingFromTheLastToTheFirstRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.nextRadioStation();

        assertEquals(rad.getFirstRadioStation(), rad.getCurrentRadioStation());
    }

    @Test
    public void switchingToPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        rad.prevRadioStation();

        assertEquals(rad.getFirstRadioStation(), rad.getCurrentRadioStation());
    }

    @Test
    public void switchingFromTheFirstToTheLastRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.prevRadioStation();

        assertEquals(rad.getLastRadioStation(), rad.getCurrentRadioStation());
    }

    @Test
    public void changingTheVolumeTo9() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);

        assertEquals(9, rad.getCurrentVolume());
    }

    @Test
    public void maximumVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        assertEquals(rad.getMaxVolume(), rad.getCurrentVolume());
    }

    @Test
    public void changingTheVolumeTo11() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        assertEquals(5, rad.getCurrentVolume());
    }

    @Test
    public void changingTheVolumeToMinus1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        assertEquals(5, rad.getCurrentVolume());
    }

    @Test
    public void increaseTheSoundVolumeBy1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);

        rad.increaseVolume();

        assertEquals(rad.getMaxVolume(), rad.getCurrentVolume());
    }

    @Test
    public void increaseTheVolumeBy1AtMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        assertEquals(rad.getMaxVolume(), rad.getCurrentVolume());
    }

    @Test
    public void turnDownTheSoundVolumeBy1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.turnDownVolume();

        assertEquals(rad.getMinVolume(), rad.getCurrentVolume());
    }

    @Test
    public void turnDownTheVolumeBy1AtMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.turnDownVolume();

        assertEquals(rad.getMinVolume(), rad.getCurrentVolume());
    }
}
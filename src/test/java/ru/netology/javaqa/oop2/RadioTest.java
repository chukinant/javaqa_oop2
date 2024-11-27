package ru.netology.javaqa.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //tests devoted to setCurrentStation method
    @Test
    void shouldSetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationToMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationToMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentStationIfNegative() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int unexpected = -1;
        int actual = rad.getCurrentStation();

        Assertions.assertNotEquals(unexpected, actual);
    }

    @Test
    void shouldNotSetCurrentStationIfAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int unexpected = 10;
        int actual = rad.getCurrentStation();

        Assertions.assertNotEquals(unexpected, actual);
    }

    //=================================================

    //tests devoted to switchToNextStation method
    @Test
    void shouldSwitchToNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);
        rad.switchToNextStation();

        int expected = 6;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchToZeroStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.switchToNextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //=================================================

    //tests devoted to switchToPreviousStation method
    @Test
    void shouldSwitchToPreviousStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);
        rad.switchToPreviousStation();

        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchToNineStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.switchToPreviousStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //=================================================

    //tests devoted to setCurrentVolume method
    @Test
    void shouldSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeToMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.minVolume);

        int expected = rad.minVolume;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeIfNegative() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeToMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.maxVolume);

        int expected = rad.maxVolume;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int unexpected = 101;
        int actual = rad.getCurrentVolume();

        Assertions.assertNotEquals(unexpected, actual);
    }

    //=================================================

    //tests devoted to increaseVolume method
    @Test
    void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.increaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeIfMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(rad.maxVolume);
        rad.increaseVolume();

        int expected = rad.maxVolume;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //=================================================

    //tests devoted to decreaseVolume method
    @Test
    void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.decreaseVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeBelowZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
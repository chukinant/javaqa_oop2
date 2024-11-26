package ru.netology.javaqa.oop2;

public class Radio {

    public int currentStation;
    public int minVolume = 0;
    public int currentVolume = minVolume;
    public int maxVolume = 100;

    //methods for stations

    public int setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return -1;
        }
        if (newCurrentStation > 9) {
            return -1;
        }
        currentStation = newCurrentStation;
        return currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void switchToNextStation() {
        if (currentStation == 9) {
            setCurrentStation(0);
        }
        else {setCurrentStation(currentStation + 1);}
    }

    public void switchToPreviousStation() {
        if (currentStation == 0) {
            setCurrentStation(9);
        }
        else {setCurrentStation(currentStation - 1);}
    }

    // methods related to volume

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);;
        }
    }

}

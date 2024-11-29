package ru.netology.javaqa.oop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int freqQty = 10;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    //methods for stations

    public Radio (int freqQty) {
        this.freqQty = freqQty;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > freqQty - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void switchToNextStation() {
        if (currentStation == freqQty - 1) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void switchToPreviousStation() {
        if (currentStation == 0) {
            setCurrentStation(freqQty - 1);
        } else {
            setCurrentStation(currentStation - 1);
        }
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

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}

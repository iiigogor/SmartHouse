package ru.netology;

public class Radio {

    // переключатель станций
   // private int[]currentStation = new int[10];

   private int currentStation;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 | currentStation > 9) {
            System.out.println("Неверный номер станции");
            return;
        }
        this.currentStation = currentStation;
    }

    public int switchToNextUpStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return currentStation;
        }
        currentStation++;
        return currentStation;
    }

    public int switchToPrevDownStation() {

        if (currentStation == 0) {
            currentStation = 9;
            return currentStation;
        }
        currentStation--;
        return currentStation;
    }


    //    переключатель громкости
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 | currentVolume > 10) {
            System.out.println("Неверное значение громкости");
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {

        if (currentVolume == 10) {
            System.out.println("Maximum volume");
            currentVolume = 10;
            return currentVolume;
        }
        currentVolume++;
        return currentVolume;
    }


    public int decreaseVolume() {
        if (currentVolume == 0) {
            System.out.println("Minimum volume");
            currentVolume = 0;
            return currentVolume;
        }
        currentVolume--;
        return currentVolume;
    }
}




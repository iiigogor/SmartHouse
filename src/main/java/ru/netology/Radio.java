package ru.netology;

public class Radio{
    // переключатель станций
    private int totalStation = 10;


    //конструктор по умолчанию -
    public Radio() {

    }
    //конструктор с количеством станций

    public Radio(int totalStation) {
        this.totalStation = totalStation;
    }

    public void setTotalStation(int totalStation) {
        this.totalStation = totalStation;
    }

    public int getTotalStation() {
        return totalStation;
    }

    public int countMaxStation() {
        if (totalStation < 1) {
            System.out.println(totalStation + " -неверное количество станций ");
            return 0;
        }
        return totalStation - 1;
    }


    private int currentStation;


    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 | currentStation > totalStation - 1) {
            System.out.println("Неверный номер станции");
            return;
        }
        this.currentStation = currentStation;
    }

    public int switchToNextUpStation() {
        if (currentStation == totalStation - 1) {
            currentStation = 0;
            return currentStation;
        }
        currentStation++;
        return currentStation;
    }

    public int switchToPrevDownStation() {

        if (currentStation == 0) {
            currentStation = totalStation - 1;
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
        if (currentVolume < 0 | currentVolume > 100) {
            System.out.println("Неверное значение громкости");
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {

        if (currentVolume == 100) {
            System.out.println("Maximum volume");
            currentVolume = 100;
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




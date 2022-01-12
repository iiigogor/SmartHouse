package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //переключение станций
    Radio rad = new Radio();

    //Тест  больше 9
    @Test
    void setCurrentStationUp9() {
        rad.setCurrentStation(20);
        assertEquals(0, rad.getCurrentStation());
    }

    //Тест  <0
    @Test
    void setCurrentStationDown0() {
        rad.setCurrentStation(-10);
        assertEquals(0, rad.getCurrentStation());
    }

    //повышение внутри диапазона
    @Test
    void switchToNextUpStation() {
        rad.setCurrentStation(5);
        assertEquals(6, rad.switchToNextUpStation());
    }

    //повышение- граничное значение =9
    @Test
    void testForUp9Station() {
        rad.setCurrentStation(9);
        assertEquals(0, rad.switchToNextUpStation());
    }


    //повышение граничное значение =0
    @Test
    void testForUp0Station() {
        rad.setCurrentStation(0);
        assertEquals(1, rad.switchToNextUpStation());
    }

    //ПОНИЖЕНИЕ
    //внутри диапазона
    @Test
    public void switchToPrevDownStation() {
        rad.setCurrentStation(6);
        assertEquals(5, rad.switchToPrevDownStation());
    }

    //понижение граница =9
    @Test
    void testForDown9Station() {
        rad.setCurrentStation(9);
        assertEquals(8, rad.switchToPrevDownStation());
    }

    //понижение граница =0
    @Test
    void testForDown0Station() {
        rad.setCurrentStation(0);
        assertEquals(9, rad.switchToPrevDownStation());
    }

    // Регулятор громкости

    // Тест >10
    @Test
    void setCurrentVolumeUp10() {
        rad.setCurrentVolume(20);
        assertEquals(0, rad.getCurrentVolume());
    }

    // Тест <0
    @Test
    void setCurrentVolumeDown0() {
        rad.setCurrentVolume(-10);
        assertEquals(0, rad.getCurrentVolume());
    }

    //Повышение внутри диапазона
    @Test
    void increaseVolume() {
        rad.setCurrentVolume(2);
        assertEquals(3, rad.increaseVolume());
    }

    // Понижение внутри диапазона
    @Test
    void decreaseVolume() {
        rad.setCurrentVolume(5);
        assertEquals(4, rad.decreaseVolume());
    }

    //Граница 10 - повышение
    @Test
    void increaseVolumeToUp10() {
        rad.setCurrentVolume(10);
        assertEquals(10, rad.increaseVolume());
    }

    //Граница 0 - понижение
    @Test
    void decreaseVolumeTuDown0() {
        rad.setCurrentVolume(0);
        assertEquals(0, rad.decreaseVolume());
    }
}

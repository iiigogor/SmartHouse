package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //переключение станций

    // количество станций
    @Test
    void ConstructorFor5(){
        Radio rad1=new Radio();
        rad1.setTotalStation(5);
        assertEquals(4,rad1.countMaxStation());
    }
//заграница
    @Test
    void ConstructorUp10(){
        Radio rad1=new Radio();
        rad1.setTotalStation(11);
        assertEquals(10,rad1.countMaxStation());
    }

    @Test
    void countMaxStationFor0(){
        Radio rad1= new Radio (0);
        assertEquals(0, rad1.countMaxStation());
    }
    @Test
    void setTotalStationfor5(){
        Radio rad1= new Radio (15);
        assertEquals(14,rad1.countMaxStation());
    }


    //Тест  больше 9
    @Test
    void setCurrentStationUp9() {
        Radio rad = new Radio();
        rad.setCurrentStation(20);
        assertEquals(0, rad.getCurrentStation());
    }

    //Тест  <0
    @Test
    void setCurrentStationDown0() {
        Radio rad = new Radio();
        rad.setCurrentStation(-10);
        assertEquals(0, rad.getCurrentStation());
    }

    //повышение внутри диапазона
    @Test
    void switchToNextUpStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        assertEquals(6, rad.switchToNextUpStation());
    }

    //повышение- граничное значение =9
    @Test
    void testForUp9Station() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        assertEquals(0, rad.switchToNextUpStation());
    }


    //повышение граничное значение =0
    @Test
    void testForUp0Station() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        assertEquals(1, rad.switchToNextUpStation());
    }

    //ПОНИЖЕНИЕ
    //внутри диапазона
    @Test
    public void switchToPrevDownStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(6);
        assertEquals(5, rad.switchToPrevDownStation());
    }

    //понижение граница =9
    @Test
    void testForDown9Station() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        assertEquals(8, rad.switchToPrevDownStation());
    }

    //понижение граница =0
    @Test
    void testForDown0Station() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        assertEquals(9, rad.switchToPrevDownStation());
    }

    // Регулятор громкости

    // Тест >100
    @Test
    void setCurrentVolumeUp100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(120);
        assertEquals(0, rad.getCurrentVolume());
    }

    // Тест <0
    @Test
    void setCurrentVolumeDown0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-10);
        assertEquals(0, rad.getCurrentVolume());
    }

    //Повышение внутри диапазона
    @Test
    void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(20);
        assertEquals(21, rad.increaseVolume());
    }

    // Понижение внутри диапазона
    @Test
    void decreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);
        assertEquals(49, rad.decreaseVolume());
    }

    //Граница 100 - повышение
    @Test
    void increaseVolumeToUp10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        assertEquals(100, rad.increaseVolume());
    }

    //Граница 0 - понижение
    @Test
    void decreaseVolumeTuDown0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        assertEquals(0, rad.decreaseVolume());
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void setStation() {

        Radio radio = new Radio();
        radio.setStation(4);

        int expected = 4;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setWrongStation() {

        Radio radio = new Radio();
        radio.setStation(12);

        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLowerBorderStation() {

        Radio radio = new Radio();
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setUpperBorderStation() {

        Radio radio = new Radio();
        radio.setStation(9);

        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLowerOutOfBorderStation() {

        Radio radio = new Radio();
        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setUpperOutOfBorderStation() {

        Radio radio = new Radio();
        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLowestInBorderStation() {

        Radio radio = new Radio();
        radio.setStation(1);

        int expected = 1;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setHighestInBorderStation() {

        Radio radio = new Radio();
        radio.setStation(8);

        int expected = 8;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {

        Radio radio = new Radio();
        radio.setStation(7);

        radio.next();

        int expected = 8;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxStation() {

        Radio radio = new Radio();
        radio.setStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextOutOfBorderStation() {

        Radio radio = new Radio();
        radio.setStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStation() {

        Radio radio = new Radio();
        radio.setStation(7);

        radio.previous();

        int expected = 6;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousMinStation() {

        Radio radio = new Radio();
        radio.setStation(1);

        radio.previous();

        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousOutOfBorderStation() {

        Radio radio = new Radio();
        radio.setStation(0);

        radio.previous();

        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextVolume() {

        Radio radio = new Radio();
        radio.setVolume(4);

        radio.nextVolume();

        int expected = 5;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextWrongTopVolume() {

        Radio radio = new Radio();
        radio.setVolume(100);

        radio.nextVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevVolume() {

        Radio radio = new Radio();
        radio.setVolume(4);

        radio.previousVolume();

        int expected = 3;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevWrongLowVolume() {

        Radio radio = new Radio();
        radio.setVolume(0);

        radio.previousVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }


}
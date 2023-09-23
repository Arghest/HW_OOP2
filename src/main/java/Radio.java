public class Radio {
    private int volume;
    private int station;


    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public void next() {
        if (station != 9) {
            station++;
            return;
        }
        else station = 0;
    }

    public void previous() {
        if (station != 0) {
            station--;
            return;
        }
        else station = 9;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            volume = 100;
        }
        this.volume = volume;
    }

    public void nextVolume() {
        if (volume < 100) {
            volume++;
            return;
        }
        else volume = 100;
    }

    public void previousVolume() {
        if (volume > 0) {
            volume--;
            return;
        }
        else volume = 0;
    }


}

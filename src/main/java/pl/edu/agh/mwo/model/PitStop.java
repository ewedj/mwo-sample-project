package pl.edu.agh.mwo.model;

public class PitStop {
    private int driver_number;
    private double pit_duration;
    private int lap_number;

    public PitStop(int driver_number, double pit_duration, int lap_number) {
        this.driver_number = driver_number;
        this.pit_duration = pit_duration;
        this.lap_number = lap_number;
    }

    public PitStop() {
    }

    public int getDriver_number() {
        return driver_number;
    }

    public double getPit_duration() {
        return pit_duration;
    }

    public int getLap_number() {
        return lap_number;
    }
}

package pl.edu.agh.mwo.model;

public class PitStop {
    private int driverNumber;
    private double pitDuration;
    private int lapNumber;

    public PitStop(int driverNumber, double pitDuration, int lapNumber) {
        this.driverNumber = driverNumber;
        this.pitDuration = pitDuration;
        this.lapNumber = lapNumber;
    }

    public PitStop() {
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public void setPitDuration(double pitDuration) {
        this.pitDuration = pitDuration;
    }

    public void setLapNumber(int lapNumber) {
        this.lapNumber = lapNumber;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public double getPitDuration() {
        return pitDuration;
    }

    public int getLapNumber() {
        return lapNumber;
    }
}
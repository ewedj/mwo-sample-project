package pl.edu.agh.mwo.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PitStop {

    @JsonProperty("driver_number")
    private int driverNumber;

    @JsonProperty("pit_duration")
    private double pitDuration;
    @JsonProperty("lap_number")
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

    @Override
    public String toString() {
        return "PitStop{" +
                "driverNumber=" + driverNumber +
                ", pitDuration=" + pitDuration +
                ", lapNumber=" + lapNumber +
                '}';
    }
}
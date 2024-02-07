package edu.up.eng.arleed.model;

public class TemperatureDetails {
    double[] temperatureUsage = new double[7];

    public TemperatureDetails() {
    }

    public TemperatureDetails(double[] temperatureUsage) {
        this.temperatureUsage = temperatureUsage;
    }

    public double[] getTemperatureUsage() {
        return temperatureUsage;
    }

    public void setTemperatureUsage(double[] temperatureUsage) {
        this.temperatureUsage = temperatureUsage;
    }
}

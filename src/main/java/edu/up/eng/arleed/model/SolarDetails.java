package edu.up.eng.arleed.model;

public class SolarDetails {
    double[] solarUsage = new double[7];

    public SolarDetails() {

    }

    public SolarDetails(double[] solarUsage) {
        this.solarUsage = solarUsage;
    }

    public double[] getSolarUsage() {
        return solarUsage;
    }

    public void setSolarUsage(double[] solarUsage) {
        this.solarUsage = solarUsage;
    }
}

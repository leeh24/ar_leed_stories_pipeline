package edu.up.eng.arleed.model;

public class WaterDetails {
    double[] spaceTemp = new double[7];

    public WaterDetails() {
    }

    public WaterDetails(double[] spaceTemp) {
        this.spaceTemp = spaceTemp;
    }

    public double[] getWaterUsage() {
        return spaceTemp;
    }

    public void setWaterUsage(double[] spaceTemp) {
        this.spaceTemp = spaceTemp;
    }
}

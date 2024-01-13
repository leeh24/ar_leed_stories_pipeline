package edu.up.eng.arleed.model;

public class WaterDetails {
    double[] waterUsage = new double[7];

    public WaterDetails() {
    }

    public WaterDetails(double[] waterUsage) {
        this.waterUsage = waterUsage;
    }

    public double[] getWaterUsage() {
        return waterUsage;
    }

    public void setWaterUsage(double[] waterUsage) {
        this.waterUsage = waterUsage;
    }
}

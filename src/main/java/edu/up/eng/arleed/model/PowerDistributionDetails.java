package edu.up.eng.arleed.model;

public class PowerDistributionDetails {
    double[] powerDistribution = new double[5];

    public PowerDistributionDetails() {

    }

    public PowerDistributionDetails(double[] powerDistribution) {
        this.powerDistribution = powerDistribution;
    }

    public double[] getPowerDistribution() {
        return powerDistribution;
    }

    public void setPowerDistribution(double[] powerDistribution) {
        this.powerDistribution = powerDistribution;
    }
}

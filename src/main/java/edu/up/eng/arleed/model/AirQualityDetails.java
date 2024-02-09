package edu.up.eng.arleed.model;

public class AirQualityDetails {
    double[] airQualityIndex = new double[7];

    public AirQualityDetails() {
    }

    public AirQualityDetails(double[] airQualityIndex) {
        this.airQualityIndex = airQualityIndex;
    }

    public double[] getAirQualityIndex() {
        return airQualityIndex;
    }

    public void setAirQualityIndex(double[] airQualityIndex) {
        this.airQualityIndex = airQualityIndex;
    }
}

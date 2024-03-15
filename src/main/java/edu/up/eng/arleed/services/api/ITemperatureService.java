package edu.up.eng.arleed.services.api;

import edu.up.eng.arleed.model.FloorDetails;
import com.google.gson.JsonArray;

public interface ITemperatureService {
    double[] getDailyTemperature(String env);
    String getFloorTemp(int floorNum);

}

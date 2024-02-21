package edu.up.eng.arleed.services.impl;

import edu.up.eng.arleed.services.api.ITemperatureService;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class TemperatureServiceImpl implements ITemperatureService {
    @Override
    public double[] getDailyTemperature(String env) {

        //double[] temperature = {60.0, 65.0, 73.0, 69.0, 75.0, 76.0, 72.0};
        int currHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        double[] temperature = new double[currHour];
        if (env.equals("indoor")) {
            for (int i=0; i < currHour; i++) {
                double temp = Math.floor(Math.random() * 40.0);
                if (temp < 10.0) {
                    temp = 25.0;
                }
                temperature[i] = temp;
            }
        } else {
            for (int i=0; i < currHour; i++) {
                double temp = Math.floor(Math.random() * 30.0);
                if (temp < 20.0) {
                    temp = 15.0;
                }
                temperature[i] = temp;
            }
        }


        return temperature;
    }

}

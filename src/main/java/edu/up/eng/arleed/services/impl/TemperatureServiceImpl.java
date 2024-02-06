package edu.up.eng.arleed.services.impl;

import edu.up.eng.arleed.services.api.ITemperatureService;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements ITemperatureService {
    @Override
    public double[] getTemperatureUsageByWeek() {
        double[] temperature = {60.0, 65.0, 73.0, 69.0, 75.0, 76.0, 72.0};
        return temperature;
    }

}

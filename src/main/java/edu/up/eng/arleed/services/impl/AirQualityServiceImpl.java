package edu.up.eng.arleed.services.impl;

import edu.up.eng.arleed.services.api.IAirQualityService;
import org.springframework.stereotype.Service;

@Service
public class AirQualityServiceImpl implements IAirQualityService {
    @Override
    public double[] getCurrentAirQuality() {
        double[] currentAirQuality = {150.3, 70, 90};
        return currentAirQuality;
    }
}

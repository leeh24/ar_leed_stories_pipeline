package edu.up.eng.arleed.services.impl;

import edu.up.eng.arleed.services.api.SolarPowerService;
import org.springframework.stereotype.Service;

@Service
public class SolarPowerServiceImpl implements SolarPowerService {
    @Override
    public double[] getWeeklySolarUsage() {
        double[] solarUsage = {150.3, 275.2, 320.0, 305.7, 295.9, 300.6, 170.4};
        return solarUsage;
    }
}

package edu.up.eng.arleed.services.impl;

import edu.up.eng.arleed.services.api.SolarPowerService;
import org.springframework.stereotype.Service;

@Service
public class SolarPowerServiceImpl implements SolarPowerService {
    @Override
    public double[] getWeeklySolarUsage() {
        double[] solarUsage = {150, 275, 320, 305, 295, 300, 170};
        return solarUsage;
    }
}

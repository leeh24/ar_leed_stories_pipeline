package edu.up.eng.arleed.services.impl;

import edu.up.eng.arleed.services.api.IWaterUsageService;
import org.springframework.stereotype.Service;

@Service
public class WaterUsageServiceImpl implements IWaterUsageService {

    @Override
    public double[] getWaterUsageByWeek() {
        double[] waterUsage = {2.0, 3.5, 1.5, 4.0, 5.0, 6.5, 8.5};
        return waterUsage;
    }
}

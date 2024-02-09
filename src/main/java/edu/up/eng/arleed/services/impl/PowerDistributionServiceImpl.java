package edu.up.eng.arleed.services.impl;

import edu.up.eng.arleed.services.api.PowerDistributionService;
import org.springframework.stereotype.Service;

@Service
public class PowerDistributionServiceImpl implements PowerDistributionService {
    @Override
    public double[] getWeeklyPowerDistribution() {
        double[] powerDistribution = {1823.2, 257.36, 617.491, 1712.0, 908.74};
        return powerDistribution;
    }
}

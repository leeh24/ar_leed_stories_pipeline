package edu.up.eng.arleed.endpoints;

import edu.up.eng.arleed.model.PowerDistributionDetails;
import edu.up.eng.arleed.services.api.PowerDistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PowerDistributionController {
    private final PowerDistributionService powerDistributionService;

    @Autowired
    public PowerDistributionController(PowerDistributionService powerDistributionService) {
        this.powerDistributionService = powerDistributionService;
    }

    @GetMapping("/weeklypowerdistribution")
    public PowerDistributionDetails getWeeklyDistribution() {
        double[] powerDistribution = powerDistributionService.getWeeklyPowerDistribution();
        return new PowerDistributionDetails(powerDistribution);
    }
}

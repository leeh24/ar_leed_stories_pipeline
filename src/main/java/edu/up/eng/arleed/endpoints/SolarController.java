package edu.up.eng.arleed.endpoints;

import edu.up.eng.arleed.model.SolarDetails;
import edu.up.eng.arleed.services.api.SolarPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolarController {
    private final SolarPowerService solarPowerService;

    @Autowired
    public SolarController(SolarPowerService solarPowerService) {
        this.solarPowerService = solarPowerService;
    }

    @GetMapping("/weeklysolarusage")
    public SolarDetails getWeeklySolarUsage() {
        double[] solarUsage = solarPowerService.getWeeklySolarUsage();
        return new SolarDetails(solarUsage);
    }
}

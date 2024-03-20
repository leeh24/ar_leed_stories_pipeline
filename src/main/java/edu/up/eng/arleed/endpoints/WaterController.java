package edu.up.eng.arleed.endpoints;

import edu.up.eng.arleed.model.WaterDetails;
import edu.up.eng.arleed.services.api.IWaterUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterController {
    private final IWaterUsageService waterUsageService;

    @Autowired
    public WaterController(IWaterUsageService waterUsageService) {
        this.waterUsageService = waterUsageService;
    }


    @GetMapping("/SpaceTemp-Q1-2024")
    public WaterDetails getWaterUsageByWeek() {
        double[] spaceTemp = waterUsageService.getWaterUsageByWeek();
        return new WaterDetails(spaceTemp);
    }


}

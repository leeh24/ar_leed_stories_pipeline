package edu.up.eng.arleed.endpoints;

import edu.up.eng.arleed.model.AirQualityDetails;
import edu.up.eng.arleed.services.api.IAirQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirQualityController {
    private final IAirQualityService airQualityService;

    @Autowired
    public AirQualityController(IAirQualityService airQualityService) {
        this.airQualityService = airQualityService;
    }

    @GetMapping("/airQualityIndex")
    public AirQualityDetails getAirQualityIndex() {
        double[] airQuality = airQualityService.getCurrentAirQuality();
        return new AirQualityDetails(airQuality);
    }
}

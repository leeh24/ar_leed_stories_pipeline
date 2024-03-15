package edu.up.eng.arleed.endpoints;

import edu.up.eng.arleed.model.FloorDetails;
import edu.up.eng.arleed.model.TemperatureDetails;
import edu.up.eng.arleed.services.api.ITemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.*;

@RestController
public class TemperatureController {
    private final ITemperatureService temperatureService;

    @Autowired
    public TemperatureController(ITemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @GetMapping("/dailytemperature")
    public TemperatureDetails getDailyTemperature(@RequestParam String env) {
        double[] temperatureUsage = temperatureService.getDailyTemperature(env);
        return new TemperatureDetails(temperatureUsage);
    }

    @GetMapping("/floorTemperature/{floorNum}")
    public String getFloorTemperature(@PathVariable int floorNum) {
        String floorDetails = temperatureService.getFloorTemp(floorNum);
        return floorDetails;
    }

 }

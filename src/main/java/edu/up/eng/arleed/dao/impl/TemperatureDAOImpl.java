package edu.up.eng.arleed.dao.impl;

import edu.up.eng.arleed.dao.api.ITemperatureDAO;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import com.google.gson.*;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

@Service
public class TemperatureDAOImpl implements ITemperatureDAO {
    @Override
    public String getFloorTemp(int floorNum) {
        String floorJson = "";
        try {
            String filename = "floor" + floorNum +".json";
            Resource resource = new ClassPathResource(filename);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream()));

            Gson gson = new Gson();
            JsonObject floorJsonObject = gson.fromJson(bufferedReader, JsonObject.class);
            floorJson = gson.toJson(floorJsonObject);
            System.out.println(floorJson);
        } catch (Exception ex){
            ex.printStackTrace();
        }

        return floorJson;
    }

}

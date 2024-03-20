package edu.up.eng.arleed.services.impl;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import edu.up.eng.arleed.services.api.IWaterUsageService;

@Service
public class WaterUsageServiceImpl implements IWaterUsageService {

    @Override
    public double[] getWaterUsageByWeek() {
        //Originally named  "Dev 25257, AV 12, present-value, SMC_TU-4-02 Space Temp-Q1-2024.csv"
        String csvFileName = "SpaceTemp-Q1-2024.csv"; // Specify the file name
        
        try (CSVReader reader = new CSVReader(new InputStreamReader(new ClassPathResource(csvFileName).getInputStream()))) {
            // Read the CSV file and store the values in a list
            List<Double> waterUsageList = new ArrayList<>();
            String[] line;
            while ((line = reader.readNext()) != null) {
                // Assuming second column index is 1 (0-based indexing)
                String value = line[1]; // Get the value from the second column
                waterUsageList.add(Double.parseDouble(value)); // Add the value to the list
            }
            
            // Convert the list to an array of doubles
            double[] spaceTemp = new double[waterUsageList.size()];
            for (int i = 0; i < waterUsageList.size(); i++) {
                spaceTemp[i] = waterUsageList.get(i);
            }
            
            return spaceTemp;
        } catch (IOException | NumberFormatException | CsvValidationException e) {
            // Handle exceptions
            e.printStackTrace();
            return null; // Return null if an exception occurs
        }
    }
}

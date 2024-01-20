package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DatasetLoader {
    public List<DatasetRecord> loadData(String filePath) {
        List<DatasetRecord> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                DatasetRecord record = new DatasetRecord(
                        Integer.parseInt(values[0]),
                        values[1],
                        values[2]
                );
                records.add(record);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return records;
    }
}

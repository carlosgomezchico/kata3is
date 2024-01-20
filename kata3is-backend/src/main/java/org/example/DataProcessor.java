package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProcessor {
    public Map<Integer, Integer> generateAgeHistogram(List<DatasetRecord> records) {
        Map<Integer, Integer> histogram = new HashMap<>();
        for (DatasetRecord record : records) {
            int age = record.getAge();
            histogram.put(age, histogram.getOrDefault(age, 0) + 1);
        }
        return histogram;
    }
}

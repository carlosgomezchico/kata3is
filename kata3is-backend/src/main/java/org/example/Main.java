package org.example;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DatasetLoader loader = new DatasetLoader();
        List<DatasetRecord> records = loader.loadData("path/to/your/dataset.csv");

        DataProcessor processor = new DataProcessor();
        Map<Integer, Integer> histogram = processor.generateAgeHistogram(records);

        DataVisualizer visualizer = new DataVisualizer();
        visualizer.displayHistogram(histogram);
    }
}


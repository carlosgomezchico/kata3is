package org.example;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.util.Map;
public class DataVisualizer {
    public void displayHistogram(Map<Integer, Integer> histogram) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            dataset.addValue(entry.getValue(), "Frequency", entry.getKey());
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Age Histogram", // Chart title
                "Age", // X-axis label
                "Frequency", // Y-axis label
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        // Create a JFrame to display the chart
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.add(chartPanel);
        frame.setTitle("Data Visualization");
        frame.setSize(600, 400);
        frame.pack();
        frame.setVisible(true);
    }
}


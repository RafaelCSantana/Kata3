package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay(){
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    private JPanel createPanel(){
        ChartPanel panel = new ChartPanel(createChart(createDataset()));
        panel.setPreferredSize(new Dimension(500,400));
        return panel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart
                           ("Histograma JFreeChart","Dominios email","Nº email",
                             dataSet,PlotOrientation.VERTICAL,false,
                             rootPaneCheckingEnabled,rootPaneCheckingEnabled);
        return chart;     
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(12,"","ull.es");
        dataSet.addValue(20,"","ulpgc.es");
        dataSet.addValue(10,"","outlook.es");
        dataSet.addValue(35,"","gmail.es");
        return dataSet;
    }
    
    public void execute() {
        setVisible(true);
    }
}
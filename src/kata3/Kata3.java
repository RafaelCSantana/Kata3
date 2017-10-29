package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histo = new Histogram();
        histo.increment("ulpgc.es");
        histo.increment("ull.es");
        histo.increment("ull.es");
        histo.increment("ulpgc.es");
        histo.increment("ull.es");
        histo.increment("gmail.es");
        histo.increment("gmail.es");
        histo.increment("gmail.es");
        histo.increment("gmail.es");
        histo.increment("gmail.es");
        histo.increment("gmail.es");
        histo.increment("ulpgc.es");
        histo.increment("ull.es");
        histo.increment("ull.es");
        histo.increment("ull.es");
        histo.increment("outlook.es");
        HistogramDisplay histogram = new HistogramDisplay(histo);
        histogram.execute();
    }
}

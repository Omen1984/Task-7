package web.model;

public class Car {

    private String model;
    private int series;
    private boolean forwardFlow;

    public Car() {
    }

    public Car(String model, int series, boolean forwardFlow) {
        this.model = model;
        this.series = series;
        this.forwardFlow = forwardFlow;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public boolean getForwardFlow() {
        return forwardFlow;
    }

    public void setForwardFlow(boolean forwardFlow) {
        this.forwardFlow = forwardFlow;
    }
}

package web.model;

public class Car {

    private int id;
    private String series;
    private String engine;

    public Car() {

    }

    public Car(int id, String series, String engine) {
        this.id = id;
        this.series = series;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", series='" + series + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
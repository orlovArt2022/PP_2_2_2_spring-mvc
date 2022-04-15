package web.model;

public class Car {
    private String name;
    private String series;
    private int engineVolume;

    public Car() {
    }

    public Car(String name, String series, int engineVolume) {
        this.name = name;
        this.series = series;
        this.engineVolume = engineVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
}

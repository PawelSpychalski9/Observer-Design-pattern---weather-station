import java.util.ArrayList;

public class WeatherData implements Subject{
    private double temperature;
    private double pressure;
    private double humidity;
    ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(temperature, pressure, humidity);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double pressure, double humidity) {
         this.temperature = temperature;
         this.humidity = humidity;
         display();
    }

    @Override
    public void display(){
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
    }
}

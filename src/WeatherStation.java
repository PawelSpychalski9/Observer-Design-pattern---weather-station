public class WeatherStation {
    public static void main(String[] args){
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay cod = new CurrentConditionsDisplay(wd);
        wd.setMeasurements(21, 52, 1007);
    }
}

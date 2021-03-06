/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package weather_app.constants;

/**
 *
 * @author rd
 */
public class Constants
{    
    public static final String OPENWEATHERAPIKEY = "d75f1bf4b196f38e62994c662b6a87ef";
    
    public final String getOpenWeatherForecast(String city) {
        return "http://api.openweathermap.org/data/2.5/forecast?q="
                + city
                + ",PT&APPID=" + OPENWEATHERAPIKEY;
    }
    
    public Double kelvinToCelsius(Double kelvin){ return kelvin - 273.15;}
    
    public final String forecastKeyCache(String city) {return "Forecast"+city;}
    public final String humidityDay(String city) {return "HumidityDay"+city;}
    public final String humidityHour(String city) {return "HumidityHour"+city;}
    public final String temperatureDay(String city) {return "TemperatureDay"+city;}
    public final String temperatureHour(String city) {return "TemperatureHour"+city;}
    
    
    
    
    
}

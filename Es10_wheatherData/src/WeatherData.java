import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class WeatherData {

    private String city;
    private LocalDate date;
    private double temperaure;
    private double precipitation;
    private double humidity;

    public WeatherData(String city, LocalDate date, double temperaure, double precipitation, double humidity) {
        this.city = city;
        this.date = date;
        this.temperaure = temperaure;
        this.precipitation = precipitation;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemperaure() {
        return temperaure;
    }

    public void setTemperaure(double temperaure) {
        this.temperaure = temperaure;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return  city + '-' + date +  "-" + temperaure + "°C" + " - " + precipitation + "mm" + " - " + humidity + "%";
    }

}

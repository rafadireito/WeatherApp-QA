
package weather_app.openweather;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cod",
    "message",
    "cnt",
    "list",
    "city"
})
public class GeneralOpenWeather {

    @JsonProperty("cod")
    private String cod;
    @JsonProperty("message")
    private Double message;
    @JsonProperty("cnt")
    private Integer cnt;
    @JsonProperty("list")
    private java.util.List<weather_app.openweather.ListOpenWeather> list = null;
    @JsonProperty("city")
    private CityOpenWeather city;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cod")
    public String getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(String cod) {
        this.cod = cod;
    }

    @JsonProperty("message")
    public Double getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Double message) {
        this.message = message;
    }

    @JsonProperty("cnt")
    public Integer getCnt() {
        return cnt;
    }

    @JsonProperty("cnt")
    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    @JsonProperty("list")
    public java.util.List<weather_app.openweather.ListOpenWeather> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<weather_app.openweather.ListOpenWeather> list) {
        this.list = list;
    }

    @JsonProperty("city")
    public CityOpenWeather getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(CityOpenWeather city) {
        this.city = city;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

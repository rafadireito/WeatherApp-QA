package weather_app.restapi;

import com.google.common.cache.Cache;
import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import weather_app.constants.cache.mCache;

@SpringBootApplication
public class WeatherApp {
    
    public static final Logger logger = LoggerFactory.getLogger(WeatherApp.class);
    public static final RestTemplate restTemplate = new RestTemplate();
    public static final mCache mCache = new mCache(30);
    
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WeatherApp.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        app.run(args);

    }
    
}


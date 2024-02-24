package thunderbard.dietitian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DietitianApiApplication {

    private String txt;

    public static void main(String[] args) {
        SpringApplication.run(DietitianApiApplication.class, args);
    }

}

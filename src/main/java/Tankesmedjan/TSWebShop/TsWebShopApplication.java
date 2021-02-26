package Tankesmedjan.TSWebShop;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableEncryptableProperties
@SpringBootApplication
public class TsWebShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsWebShopApplication.class, args);
	}

}

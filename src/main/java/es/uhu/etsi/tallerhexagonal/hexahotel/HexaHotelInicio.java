package es.uhu.etsi.tallerhexagonal.hexahotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HexaHotelInicio {
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(HexaHotelInicio.class);
		application.run(args);	}

}

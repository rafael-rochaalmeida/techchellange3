package br.com.reserva.avaliacao.restaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;





@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ReservaAvaliacaoRestauranteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservaAvaliacaoRestauranteApplication.class, args);
	}

}

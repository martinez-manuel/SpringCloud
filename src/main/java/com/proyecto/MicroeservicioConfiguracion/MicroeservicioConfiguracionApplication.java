package com.proyecto.MicroeservicioConfiguracion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroeservicioConfiguracionApplication {

	@Value("${app.message}")
	String valor;
	@Value("${saludo}")
	String propiedad;
	public static void main(String[] args) {
		SpringApplication.run(MicroeservicioConfiguracionApplication.class, args);
	}

}

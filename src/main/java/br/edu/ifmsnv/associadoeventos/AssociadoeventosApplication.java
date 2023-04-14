package br.edu.ifmsnv.associadoeventos;

import java.util.Date;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AssociadoeventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssociadoeventosApplication.class, args);
	}
	
	@GetMapping("/olamundo")
	public ResponseEntity<String> olamundo(){
		return ResponseEntity.ok("Ola Mundo!!!");
	}
	
	@GetMapping("/datahora")
	public ResponseEntity<Date> datahora(){
		var datahora = new Date();
		return ResponseEntity.ok(datahora);	
	}
}

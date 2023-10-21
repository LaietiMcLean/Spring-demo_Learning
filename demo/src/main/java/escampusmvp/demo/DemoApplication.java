package escampusmvp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	/*Este m�todo arranca el contexto de Spring, de forma que se a�aden todos los
		beans, se resuelven sus respectivas inyecciones, etc.*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

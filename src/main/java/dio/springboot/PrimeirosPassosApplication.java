package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

//	@Bean // Aula 3
//	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
//		return args -> {
//			sistema.enviarConfirmacaoCadastro();
//			sistema.enviarMensagemBoasVindas();
//			sistema.enviarConfirmacaoCadastro();
//		};
//	}
	
//	@Bean // Aula 2
//	public CommandLineRunner run(ConversorJson conversor) throws Exception {
//		return args -> {
//			String json = "{\"cep\":\"01001-000\",\"logradouro\":\"Praça da Sé\", \"cidade\":\"São Paulo\"}";
//			ViaCepResponse response = conversor.converter(json);
//			System.out.println("Dados do CEP: " + response);
//		};
//	}


}

package dio.springboot.app._4propertiesValue;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {

	@Value("${name:NoReply-DIO}")
	private String nome;// = "ANGELO CHIARELLA";
	@Value("${email}")
	private String email;// = "angelo@email.com";
	@Value("${telefones}")
	private List<Long> telefones;// = new ArrayList<>(Arrays.asList(new Long[] { 11987654321L, 13123456789L }));

	@Override
	public void run(String... args) throws Exception {
		System.out.println(
				"Mensagem enviada por: " + nome + "\nE-mail: " + email + "\nCom telefones para contato: " + telefones);
		System.out.println("Seu cadastro foi aprovado!");

	}
}

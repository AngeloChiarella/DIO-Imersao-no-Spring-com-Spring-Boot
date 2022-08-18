//package dio.springboot.app._6conceitoOrmJpa;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import dio.springboot.app._6conceitoOrmJpa.model.Usuario;
//import dio.springboot.app._6conceitoOrmJpa.repository.UsuarioRepository;
//
//@Component
//public class StartApp implements CommandLineRunner {
//
//	@Autowired
//	private UsuarioRepository repository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Usuario user = new Usuario("Angelo Chiarella", "aglchl", "dio123");
//		repository.save(user);
//		
//		Usuario user2 = new Usuario();
//		user2.setName("Anderson Chiarella");
//		user2.setUsername("adschl");
//		user2.setPassword("dio321");
//		repository.save(user2);
//		
//		for(Usuario u: repository.findAll()) {
//			System.out.println(u);
//		}
//	}
//
//}

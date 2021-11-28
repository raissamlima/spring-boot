package com.zuplae.banco;

//import java.util.List;

import com.zuplae.banco.model.Filme;
import com.zuplae.banco.repository.FilmeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner {
	private FilmeRepository repository;

	public BancoApplication(FilmeRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Filme model = new Filme();
		model.setId(2);
		model.setNome("Tomates Verdes Fritos");
		model.setNomeDiretor("** **");
		model.setGenero("Drama");

		repository.save(model);
		//repository.deleteById(2);

		// List<Filme> lista = (List<Filme>)repository.findAll();

		// findAll é uma lista mais generica de filme
		// System.out.println("\n");
		// for (Filme f : lista) {
		// System.out.printf("%d - %s\n", f.getId(), f.getNome(), f.getNomeDiretor(),
		// f.getGenero());
		// }
		// System.out.println("\n");

		System.out.println("\n");
		repository.findAll().forEach(
				f -> System.out.printf("%d - %s\n", f.getId(), f.getNome(), f.getNomeDiretor(), f.getGenero()));
		System.out.println("\n");
	}
}

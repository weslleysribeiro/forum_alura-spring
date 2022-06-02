package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<Topico> lista() {
		Topico topico = new Topico("Dúvida", "Dúvida sobre spring", new Curso("Spring", "Programação"));

		return Arrays.asList(topico, topico, topico);
	}

}

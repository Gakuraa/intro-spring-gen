package com.generatiion.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mostra")
public class HelloWorldController {
	
	@GetMapping("helloworld")
	public String helloWorld () {
		return "Hello World";
	}
	
	@GetMapping("bsm")
	public String bsm () {
		return" <h1>BSM’s da Generation Brasil:\n </h1><br/>"
				+ "Mentalidade de Crescimento<br/>" +
				"Responsabilidade Pessoal<br/>" + 
				"Orientação ao Futuro<br/>"
	            + "Proatividade<br/>"
	            + "Comunicação<br/>"
	            + "Trabalho em Equipe<br/>"
	            + "Orientação ao Detalhe";
	}
	
	@GetMapping("aprendizado")
	public String aprendizado () {
		return "<h1>Meu aprendizado da semana: </h1>Essa semana fui fui interessante, aprendi novos conceitos em relação a linguagem SQL"
				+ " consegui também aprender novos comando dentro no banco de dados MySQL e além disso, diagramação MER dentro do MySQL "
				+ "WorkBench";
	}
	
}

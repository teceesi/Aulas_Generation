package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/atividade_1")
public class atividadeController {
	@GetMapping
	public String mentalidade() {
		return "Atenção aos detalhes";
	}

}

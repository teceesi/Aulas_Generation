package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/atividade_2")
public class atividade_2 {
	@GetMapping
	public String Disposicao() {
		return "Exercitar paciência";
	}

}

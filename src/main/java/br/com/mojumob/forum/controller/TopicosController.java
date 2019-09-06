package br.com.mojumob.forum.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mojumob.forum.controller.dto.TopicoDto;
import br.com.mojumob.model.Curso;
import br.com.mojumob.model.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	//@ResponseBody //Diz ao spring boot que o retorno será direto e não passará por uma view. 
	//Não precisar ser utilizado com o RestController 
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Duvida", "Duvida de spring", new Curso("Spring", "Programação"));
		
		return TopicoDto.coverter(Arrays.asList(topico, topico, topico));
	}

}

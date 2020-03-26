package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria cat = new Categoria(1,"Informatica");
		Categoria cat2 = new Categoria(12,"Escritorio");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat);
		lista.add(cat2);
		
		
		return lista;
	}
		
}

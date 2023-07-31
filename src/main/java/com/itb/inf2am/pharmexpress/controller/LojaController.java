package com.itb.inf2am.pharmexpress.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2am.pharmexpress.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

	@GetMapping("/listar")
	public String  listarProdutos(Model model) {
		
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		
		p1.setId(101);
		p1.setNome("Maquina de Lavar Brastemp 151");
		p1.setDescricao("Maquina de lavar Brastemp com tela");
		p1.setCodigoBarras("JQA151312SDA");
		p1.setPreco(3651.21);
		
		Produto p2 = new Produto();
		
		p2.setId(102);
		p2.setNome("Secador de Cabelo");
		p2.setDescricao("Secador de cabelo com seda");
		p2.setCodigoBarras("ADSA2605");
		p2.setPreco(2536.32);
		
		Produto p3 = new Produto();
		
		p3.setId(103);
		p3.setNome("Camiseta Fueltech");
		p3.setDescricao("Camiseta do rx-7 da fueltech");
		p3.setCodigoBarras("ADAWDER3256");
		p3.setPreco(150.00);
		
		
		listaDeProdutos.add(p3);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p1);
		
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		
		return "produtos";
		
	}
	@GetMapping("/novo-produto")
	public String NovoProduto(Model model) {
		return "novo-produto";
	}
}

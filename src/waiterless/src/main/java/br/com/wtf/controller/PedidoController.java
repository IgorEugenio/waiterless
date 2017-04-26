package br.com.wtf.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.wtf.model.Item;
import br.com.wtf.model.ItemRepository;
import br.com.wtf.repository.PedidoRepository;

@Controller
public class PedidoController {
	ArrayList<Item> listItens = new ArrayList<>();
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private ItemRepository itemRepository;
	
	@RequestMapping(path = "/pedido", method = RequestMethod.GET)
	public void listarItens(){
		listItens = (ArrayList<Item>) itemRepository.findAll();
	}
}

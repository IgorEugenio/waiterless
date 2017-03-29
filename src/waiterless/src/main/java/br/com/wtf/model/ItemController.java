package br.com.wtf.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ItemController {

	@GetMapping("/cardapio")
	public String itemForm(Model model) {
		model.addAttribute("item", new Item());
		return "cardapio";
	}

	@Autowired
	private ItemRepository itemRepository;

	/*
	 * @RequestMapping("/cardapio") public List<Item> getCardapio() { List<Item>
	 * cardapio = new ArrayList<Item>();
	 * 
	 * Item it1 = new Item("caca","bebida","bebida",12.5); Item it2 = new
	 * Item("caca1","bebida","bebida",12.5); Item it3 = new
	 * Item("caca2","bebida","bebida",12.5);
	 * 
	 * cardapio.add(it1); cardapio.add(it2); cardapio.add(it3);
	 * 
	 * return cardapio; }
	 */

	@PostMapping("/cardapio")
	public String ItemSubmit(@ModelAttribute Item item) {
		itemRepository.save(item);
		return "resultado";
	}
}

package br.com.wtf.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
	
    @GetMapping("/cardapio")
    public String itemForm(Model model) {
        model.addAttribute("item", new Item());
        return "cardapio";
    }

 /*   @PostMapping("/cardapio")
    public String ItemSubmit(@ModelAttribute Item item) {
        return "resultado";
    }*/
}

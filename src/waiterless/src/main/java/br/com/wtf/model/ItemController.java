package ola;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {
	
    @GetMapping("/cadarpio")
    public String ItemForm(Model model) {
        model.addAttribute("item", new Item());
        return "cardapio";
    }

    @PostMapping("/cardapio")
    public String ItemSubmit(@ModelAttribute Item item) {
        return "resultado";
    }
}

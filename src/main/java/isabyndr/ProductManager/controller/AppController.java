package isabyndr.ProductManager.controller;

import isabyndr.ProductManager.entity.Product;
import isabyndr.ProductManager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Product> listProducts=productService.listAll();
        model.addAttribute("listProducts", listProducts);

        return "home_page";

    }

    @RequestMapping("new")
    public String newShowProductForm(Model model){
        Product product=new Product();
        model.addAttribute("product", product);
        return "new_product";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.save(product);
        return "redirect:/";

    }
    @GetMapping("/edit/{id}")
    public String showEditProductForm(@PathVariable(name = "id") Long id, Model model){
        model.addAttribute("product", productService.get(id));
        return "edit_product";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        productService.delete(id);
        return "redirect:/";
    }
}
















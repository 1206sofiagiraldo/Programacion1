package co.edu.umanizales.myapi1.controller;

import co.edu.umanizales.myapi1.model.Sale;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sale")
public class SaleController {
    @GetMapping
    public String Sale(){
        Sale sale = new Sale("Endogard10","2tabletas","8000");
        return "sale";

    }
}

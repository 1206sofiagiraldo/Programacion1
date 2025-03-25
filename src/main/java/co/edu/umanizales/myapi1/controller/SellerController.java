package co.edu.umanizales.myapi1.controller;

import co.edu.umanizales.myapi1.model.Seller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "seller")
public class
SellerController {

    @GetMapping
    public String getSeller() {
        Seller pedro = new Seller("1056789067", "Pedro", "Perez", 'M', (byte) 23, "Manizales");
        Seller juan = new Seller("1067834598", "Juan", "Suarez", 'M', (byte) 46, "Pereira");
        Seller juanita = new Seller("1045879323", "Juanita", "Jaramillo", 'F', (byte) 22, "Armenia");
        Seller andrea = new Seller("1053357890", "Andrea", "Lopez", 'F', (byte) 28, "Medellin");
        Seller camilo = new Seller("1038678910", "Camilo", "Rios", 'M', (byte) 24, "Manizales");

        return "Pedro";
        return "Juan";
        return "Juanita";
        return "Andrea";
        return "Camilo";


    }
}

package co.edu.umanizales.myapi1.controller;

import co.edu.umanizales.myapi1.model.Store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/store")
public class StoreContoller {

    @GetMapping
    public String store(){
        Store store = new Store("170001","Mascofarma","cra41#29-17","Manizales");

        return "store";

    }
}

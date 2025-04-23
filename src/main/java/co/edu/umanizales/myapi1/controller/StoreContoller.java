package co.edu.umanizales.myapi1.controller;

import co.edu.umanizales.myapi1.model.Store;
import co.edu.umanizales.myapi1.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/store")
public class StoreContoller {

    @Autowired
    private StoreService storeService;

    @GetMapping
    public List<Store> getAllStore() {
        return storeService.getStore();
    }
}
package co.edu.umanizales.myapi1.controller;

import co.edu.umanizales.myapi1.model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/location")
public class
LocationController {

    @GetMapping
    public String getLocation(){
        Location location = new Location("170001" , "Manizales")
        return "location";
    }
}

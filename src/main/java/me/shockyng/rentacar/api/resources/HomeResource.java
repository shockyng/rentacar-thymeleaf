package me.shockyng.rentacar.api.resources;

import me.shockyng.rentacar.api.services.CarsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeResource {

    private final CarsService carsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    public HomeResource(CarsService carsService) {
        this.carsService = carsService;
    }
}

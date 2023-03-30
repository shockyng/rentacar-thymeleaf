package me.shockyng.rentacar.api.resources;

import me.shockyng.rentacar.api.services.CarsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeResource {

    private final CarsService carsService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    public HomeResource(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/resources")
    public String resources(Model model) {
        model.addAttribute("cars", carsService.getAllCars());
        return "resources";
    }
}

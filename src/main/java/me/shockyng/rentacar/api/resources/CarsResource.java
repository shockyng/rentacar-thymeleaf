package me.shockyng.rentacar.api.resources;

import me.shockyng.rentacar.api.models.Car;
import me.shockyng.rentacar.api.models.Engine;
import me.shockyng.rentacar.api.services.CarsService;
import me.shockyng.rentacar.api.services.EnginesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarsResource {

    private final CarsService carsService;
    private final EnginesService enginesService;

    public CarsResource(CarsService carsService, EnginesService enginesService) {
        this.carsService = carsService;
        this.enginesService = enginesService;
    }

    @RequestMapping(value = "/resources", method = RequestMethod.GET)
    public String resources(Model model) {
        model.addAttribute("cars", carsService.getAllCars());
        return "resources";
    }

    @RequestMapping(value = "/register-car", method = RequestMethod.GET)
    public ModelAndView cars() {
        return craeteEmptyForm();
    }

    @RequestMapping(value = "/register-car", method = RequestMethod.POST)
    public ModelAndView createCar(@ModelAttribute(value = "car") Car car) {
        carsService.createCar(car);
        return craeteEmptyForm();
    }

    private ModelAndView craeteEmptyForm() {
        ModelAndView modelAndView = new ModelAndView("register-car");
        modelAndView.addObject("car", new Car());
        modelAndView.addObject("engines", enginesService.getAllEngines());
        modelAndView.addObject("engine", new Engine(0));
        return modelAndView;
    }
}

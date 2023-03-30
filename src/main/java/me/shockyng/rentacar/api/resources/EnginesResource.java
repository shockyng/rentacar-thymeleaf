package me.shockyng.rentacar.api.resources;

import me.shockyng.rentacar.api.services.EnginesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EnginesResource {

    private final EnginesService enginesService;

    public EnginesResource(EnginesService enginesService) {
        this.enginesService = enginesService;
    }

    @RequestMapping(value = "/engines", method = RequestMethod.GET)
    public ModelAndView cars() {
        ModelAndView modelAndView = new ModelAndView("engines");
        modelAndView.addObject("engines", enginesService.getAllEngines());
        return modelAndView;
    }
}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false, defaultValue = "5")
                                   int count, ModelMap model) {
        List<Car> cars = service.getCarsList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
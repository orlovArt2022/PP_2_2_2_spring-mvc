package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    List<Car> cars;
    @Autowired
    CarService service;

    @GetMapping("/cars")
    public String printCars(Model model, @RequestParam(value = "count", defaultValue = "5") int count) {
        cars = new ArrayList<>(Arrays.asList(new Car("Ford", "focus", 1),
                new Car("BMW", "X3", 2),
                new Car("Volvo", "polo", 3),
                new Car("Kia", "rio", 4),
                new Car("Vaz", "anycar", 5)));

        model.addAttribute("cars", service.getCars(count, cars));

        return "cars";
    }
}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(ModelMap model, HttpServletRequest request) {
        int count;
        String valueParameter = request.getParameter("count");

        if (valueParameter != null) {
            count = Integer.parseInt(valueParameter);
        } else {
            count = 5;
        }

        List<Car> cars;
        cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

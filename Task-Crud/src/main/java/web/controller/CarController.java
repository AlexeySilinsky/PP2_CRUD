//package web.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import web.model.Car;
//import web.service.CarService;
//
//import java.util.List;
//import java.util.ArrayList;
//
//@Controller
//public class CarController {
//
//    CarService carService =  new CarService();
//
//    @GetMapping(value = "/cars")
//    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
//        if (count == null) {
//            count = carService.getCars(Integer.MAX_VALUE).size();
//        }
//        model.addAttribute("cars", carService.getCars(count));
//        return "cars";
//    }
//
//}

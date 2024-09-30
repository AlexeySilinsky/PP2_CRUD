//package web.service;
//
//import web.model.Car;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.List;
//
//public class CarService extends Car {
//    private List<Car> cars = Arrays.asList(
//            new Car("toyota", "white",1999),
//            new Car("nissan", "blue", 1995),
//            new Car("batmobile", "black", 2010),
//            new Car("rolsroyse", "black", 1980),
//            new Car("lincoln", "red", 1975)
//    );
//
//    public List<Car> getCars(int count) {
//        if (count > cars.size()) {
//            return cars;
//        }
//        return cars.subList(0, count);
//    }
//
//}

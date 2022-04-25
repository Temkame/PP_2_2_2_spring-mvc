package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService implements CarServiceImpl {

    @Override
    public List<Car> getCarsList(int count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Astra", "2170", "red"));
        carsList.add(new Car("Corsa", "2180", "yellow"));
        carsList.add(new Car("GT", "1117", "white"));
        carsList.add(new Car("Omega", "2190", "black"));
        carsList.add(new Car("Vectra", "3102", "silver"));
        if (count >= 5) {
            return carsList;
        } else if (count <= 0){
            count = 0;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());

    }
}

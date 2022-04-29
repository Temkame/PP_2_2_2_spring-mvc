package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService implements CarServiceImpl {

    @Override
    public List<Car> getCarsList(int count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Astra", "2170", "red"));
        carsList.add(new Car("Corsa", "2180", "yellow"));
        carsList.add(new Car("GT", "1117", "white"));
        carsList.add(new Car("Omega", "2190", "black"));
        carsList.add(new Car("Vectra", "3102", "silver"));
        if (count != 0 && count <= carsList.size() && count >= 0)
            return carsList.stream().limit(count).collect(Collectors.toList());
        return carsList;
    }
}

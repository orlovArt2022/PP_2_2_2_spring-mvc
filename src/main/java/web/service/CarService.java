package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    public List<Car> getCars(int count, List<Car> cars) {
        if (count < 5 && count > 0) {
            return cars.subList(0, count);
        }
        return cars;
    }
}

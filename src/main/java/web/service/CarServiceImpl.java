package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Ford", "John", 1999));
        carList.add(new Car("Hyundai", "Otto", 2005));
        carList.add(new Car("Lamborghini", "Antonio", 2016));
        carList.add(new Car("Lada", "Boris", 1988));
        carList.add(new Car("Mercedes", "Till", 2019));
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> dataBaseCars;

    public CarService() {
        dataBaseCars = new ArrayList<>(5);
        dataBaseCars.add(new Car("car1", 1, true));
        dataBaseCars.add(new Car("car2", 2, false));
        dataBaseCars.add(new Car("car3", 3, true));
        dataBaseCars.add(new Car("car4", 4, false));
        dataBaseCars.add(new Car("car5", 5, true));
    }

    public List<Car> getCars(String amountCars) {
        int amount;
        if (amountCars != null) {
            try {
                amount = Integer.parseInt(amountCars);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Попытка вставить в параметр count строку вместо числа");
            }
        } else {
            amount = 5;
        }

        if (amount >= dataBaseCars.size() || amount < 1) {
            return new ArrayList<>(dataBaseCars);
        }

        List<Car> cars = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            cars.add(dataBaseCars.get(i));
        }
        return cars;
    }
}

package service;

import model.Car;
import repository.CarRepository;
import util.List;

public class CarService implements CarRepository {

    @Override
    public void add_Car(Car car) {
        List.car_list.add(car);
    }

}

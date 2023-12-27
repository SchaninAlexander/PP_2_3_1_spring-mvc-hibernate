package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {


    public List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1, "Audi", "r5"));
        carList.add(new Car(2, "Volvo", "r5"));
        carList.add(new Car(3, "Lexus", "v8"));
        carList.add(new Car(4, "Bmw", "r6"));
        carList.add(new Car(5, "Mersedes", "v6"));
    }

    @Override
    public List<Car> carList(int count) {
        if (count == 0 || count > 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());

    }

}
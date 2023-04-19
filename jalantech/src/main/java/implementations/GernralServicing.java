package implementations;

import enums.CarType;
import interfaces.IService;

import java.util.Map;

public class GernralServicing implements IService {
    private CarType carType;

    private static Map<CarType,Integer> carTypePrice;

    static {
        carTypePrice.put(CarType.SUV,6000);
        carTypePrice.put(CarType.SEDAN,2000);
        carTypePrice.put(CarType.HATCHBACK,4000);
    }
    GernralServicing(CarType carType){
        this.carType=carType;
    }

    @Override
    public float getPrice() {
        return carTypePrice.get(this.carType);
    }
}

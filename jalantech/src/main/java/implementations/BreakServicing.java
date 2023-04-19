package implementations;

import enums.CarType;
import interfaces.IService;

import java.util.Map;

public class BreakServicing implements IService {
    private CarType carType;

    private static Map<CarType,Integer> carTypePrice;

    static {
        carTypePrice.put(CarType.SEDAN,500);
        carTypePrice.put(CarType.HATCHBACK,750);
        carTypePrice.put(CarType.SUV,1000);
    }
    BreakServicing(CarType carType){
        this.carType=carType;
    }

    @Override
    public float getPrice() {
        return carTypePrice.get(this.carType);
    }
}

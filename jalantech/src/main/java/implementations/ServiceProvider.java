package implementations;

import enums.CarType;
import interfaces.IService;
import interfaces.IServiceProvider;

import java.util.List;

public class ServiceProvider implements IServiceProvider {
    List<IService> services;
    ServiceProvider(CarType carType,List<String>services){

    }
    @Override
    public float getTotalPrice() {
        return 0;
    }

    @Override
    public boolean startServicing() {
        return false;
    }
}

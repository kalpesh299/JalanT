package services;

import cartypes.Car;

public class Service {
    private String code;
    private String name;
    private double hatchbackPrice;
    private double sedanPrice;
    private double suvPrice;

    public Service(String code, String name, double hatchbackPrice, double sedanPrice, double suvPrice) {
        this.code = code;
        this.name = name;
        this.hatchbackPrice = hatchbackPrice;
        this.sedanPrice = sedanPrice;
        this.suvPrice = suvPrice;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice(Car car) {
        String type = car.getType();
        if (type.equalsIgnoreCase("hatchback")) {
            return hatchbackPrice;
        } else if (type.equalsIgnoreCase("sedan")) {
            return sedanPrice;
        } else if (type.equalsIgnoreCase("suv")) {
            return suvPrice;
        } else {
            throw new IllegalArgumentException("Invalid car type.");
        }
    }
}

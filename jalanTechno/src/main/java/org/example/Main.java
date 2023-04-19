package org.example;

import cartypes.Car;
import services.CarServiceStation;
import services.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarServiceStation station = new CarServiceStation();
        Scanner scanner = new Scanner(System.in);

        // Get car type from user
        System.out.print("Enter car type (Hatchback, Sedan, SUV): ");
        String carType = scanner.nextLine();
        Car car = new Car(carType);

        // Display available services
        System.out.println("Available services:");
        for (Service service : station.getServices()) {
            System.out.println(service.getCode() + " - " + service.getName());
        }

        // Get service code from user
        System.out.print("Enter service code: ");
        String serviceCode = scanner.nextLine();
        Service service = station.getServiceByCode(serviceCode);

        // Calculate price and display it to the user
        double price = service.getPrice(car);
        System.out.println("Total price for " + service.getName() + " on " + car.getType() + " is: ₹ " + price);
    }
    }

package pl.comarch.szkolenia.car.rent.gui;

import pl.comarch.szkolenia.car.rent.model.Bus;
import pl.comarch.szkolenia.car.rent.model.Car;
import pl.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Collection;
import java.util.Scanner;

public class GUI {
    private static Scanner scanner = new Scanner(System.in);
    public static String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Return car");
        System.out.println("4. Exit");
        return scanner.nextLine();
    }

    public static void listVehicles(
            Collection<Vehicle> vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public static String readPlate() {
        System.out.println("Type plate:");
        return scanner.nextLine();
    }

    public static void showSuccess(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }
}

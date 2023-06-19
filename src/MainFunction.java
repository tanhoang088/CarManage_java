import model.Vehicle;

import java.util.Scanner;

public class MainFunction {
    public static void printMenu() {
        System.out.println("MENU: ");
        System.out.println("1. Create vehicle objects and enter information.");
        System.out.println("2. Export the tax return of the vehicle.");
        System.out.println("3. Exit!");

    }

    public static void inputVehicle(Vehicle vehicle) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Vehicle Model: ");
        vehicle.setCarModel(sc.next());
        sc.nextLine();
        System.out.print("\nInput Vehicle Name: ");
        vehicle.setCarName(sc.next());
        sc.nextLine();
        System.out.print("\nInput Vehicle Value: ");
        vehicle.setCarValue(sc.nextDouble());
        System.out.print("\nInput Vehicle cylinder Capacity: ");
        vehicle.setCylinderCapacity(sc.nextInt());
    }

    public static void exportTax(Vehicle vehicle) {
        System.out.printf("Your vehicle: %s | %s | %.2f | %d\n", vehicle.getCarModel(), vehicle.getCarName(), vehicle.getCarValue(), vehicle.getCylinderCapacity());
        if (vehicle.getCylinderCapacity() < 100) {
            System.out.printf("Your vehicle tax is: %.2f VND\n", vehicle.getCarValue() * .01);
        } else if (vehicle.getCylinderCapacity()<=200) {
            System.out.printf("Your vehicle tax is: %.2f VND\n", vehicle.getCarValue() * .03);
        }
        else System.out.printf("Your vehicle tax is: %.2f VND\n", vehicle.getCarValue() * .05);
    }
}

import model.Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Scanner sc = new Scanner(System.in);
        int inputChoice;
        while (true){
            MainFunction.printMenu();
            System.out.print("\nInput your choice: ");
            inputChoice = sc.nextInt();
            switch (inputChoice){
                case 1:
                    MainFunction.inputVehicle(vehicle);
                    break;
                case 2:
                    MainFunction.exportTax(vehicle);
                    break;
                case 3: System.exit(0);
            }
        }
    }
}
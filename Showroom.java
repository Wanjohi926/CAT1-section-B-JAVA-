//Main Class Showroom

import java.util.Scanner;

public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        Car myCar = new Car(brand, model, year, fuelType);

        System.out.println("\Car Details in Showroom");
        myCar.displayDetails();

        scanner.close();
    }
}

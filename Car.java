//subclass Car

class Car extends Vehicle {
    private String fuelType;
    
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Calling the superclass constructor
        this.fuelType = fuelType;
    }
  
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls the display logic from Vehicle
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Car extends Vehicle {
    String model;
    int year;

    public Car(String brand, String fuelType, String model, int year)
  {
        super(brand, fuelType);                                           // Call parent constructor and initalize values
        this.model = model;
        this.year = year;
        
    }

  
public static void main(String[] args)
   {
        
        Car car1 = new Car("Hyundai", "Diesel", "Creta", 2023);
        car1.displayCarInfo();
    }

  public void displayCarInfo()

 {
        showVehicleInfo();                                                  // Inherited method from parent class
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }
}

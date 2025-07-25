
public class Vehicle {
    String brand;
    String fuelType;

    public Vehicle(String brand, String fuelType) 
      {
        this.brand = brand;
        this.fuelType = fuelType;
      }

 
 public static void main(String[] args) 
       {                                                             // Only one main() method will run for practice only i created main method here
    
        Vehicle v1 = new Vehicle("Toyota", "Petrol");
        v1.showVehicleInfo();
      }

   public void showVehicleInfo()
   {
        System.out.println("Brand     : " + brand);
        System.out.println("Fuel Type : " + fuelType);
    }
}

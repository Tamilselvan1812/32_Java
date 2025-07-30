public class ElectricCar extends Vehicle
{

int batteryCapacity;


public ElectricCar(String brand,int year,int batteryCapacity)
{
   super(brand,year);
   this.batteryCapacity = batteryCapacity;
}


public static void main(String[] args)
{
  ElectricCar electricCar = new ElectricCar("Honda",2015,25000);
  electricCar.startEngine();
  electricCar.showInfo();
}

public void startEngine()
{
  System.out.println("Powering electric motor");                   
}

public void showInfo()
{

   System.out.println("CarBrand :" + brand);
   System.out.println("Year :" + year);
   System.out.println("BatteryCapacity :" + batteryCapacity);

}
}
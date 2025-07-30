public class Vehicle

{
  protected String brand;
  protected int year;

public Vehicle(String brand,int year)
{
  this.brand = brand;
  this.year = year;

}

public void startEngine()
{
   System.out.println("Starting vehicle engine");
}

public void showInfo()
{

   System.out.println("CarBrand :" + brand);
   System.out.println("Year :" + year);

}
}
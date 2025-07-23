public class TemperatureConverter
{


public static void main(String[] args)
{
    TemperatureConverter converter = new TemperatureConverter();    // object

    double f1= converter.celsiusToFahrenheit(25.0);                 // method calling statement and storing return value
    double c1= converter.fahrenheitToCelsius(77.0);

    System.out.println("25C in Fahrenheit is :" + f1 );
    System.out.println("77F in Degree  is :" + c1 );

}


public double celsiusToFahrenheit(double c)
{
  return ((c * 9 / 5) + 32);                                   // formula for celsius to fahrenheit
  
}

public double fahrenheitToCelsius(double f)
{
  return ((f - 32) * 5 / 9);                                   // formula for fahrenheit to celsius
}
}
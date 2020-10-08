import java.util.Scanner;

public class Weather

{
   public static void main(String[] args) 
   {
    Scanner console = new Scanner(System.in);

    System.out.print("Enter the temperature : ");
    int temperature = console.nextInt();

    String weather;
    if (temperature >= 90)
    {
       weather = "scorcheing"; 
    }
    else if (temperature >= 80)
    {
       weather = "hot";
    }
    else if (temperature >= 70)
    {
       weather = "perfect";
    }
    else if (temperature >= 40)
    {
       weather = "cold";
    }
    else
    {
       weather = "a frozen tundra";
    }

    System.out.println("The weather is " + weather);
 }


        
    }





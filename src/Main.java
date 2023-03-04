import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //for(int cnt = 0; cnt <= 30; cnt = cnt + 1)
        {
            //System.out.println(cnt);
        }
        //for(int cnt = 30; cnt >= 0; cnt = cnt - 1)
        {
            //System.out.println(cnt);
        }
        //for(int cnt = 0; cnt <= 18; cnt = cnt + 3)
        {
            //System.out.println(cnt);
        }
        //for(int cnt = 10; cnt >= 0; cnt = cnt - 2)
        {
            //System.out.println(cnt);
        }

        //for (int r = 0; r < 5; r = r + 1)
        {
            //for (int c = 0; c <= r; c = c + 1)
            {
                //System.out.print("*");
            }
            //System.out.println();
        }
        //for (int r = 0; r < 5; r = r + 1)
        {
            //for (int c = 5; c > r; c = c - 1)
            {
                //System.out.print("*");
            }
            //System.out.println();
        }
        //for (int r = 0; r < 5; r = r + 1)
        {
            //for (int c = 0; c < 5; c = c + 1)
            {
                //System.out.print("*");
            }
            //System.out.println();
        }

        //Variables
        double tempCelsius = 0;
        double tempFahrenheit = 0;
        String trash = "";
        boolean valid = false;
        // Code for user Input
        Scanner in = new Scanner(System.in);
        // Initial prompt from program
        do
        {
            System.out.print("Please enter the temperature in degrees Celsius: ");
            // If the user input is valid
            if (in.hasNextDouble())
            {
                valid = true;
                tempCelsius = in.nextDouble();
                // Formula
                tempFahrenheit = (tempCelsius * 1.8) + 32;
                // Output "Your temperature in degrees Fahrenheit is: " + tempFahrenheit
                System.out.print("Your temperature in degrees Fahrenheit is: " + tempFahrenheit);
            }
            // If the user input is invalid/contains a letter
            else {
                trash = in.nextLine();
                // output "Invalid temperature: " + trash
                System.out.print("Invalid temperature: " + trash + "; ");
            }
        }while(!valid);
    }
}
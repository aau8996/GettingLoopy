import java.sql.SQLOutput;
import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String yNResponse = "";
        int celTemp = 0;
        double fahTemp = 0;
        String trash = "";
        boolean done = false;
        boolean validCel = false;

        do
        {
            System.out.println("Do you want to convert again [Y/N]: ");
            yNResponse = in.nextLine();
            if(yNResponse.equalsIgnoreCase("N"))
            {
                done = true;
            }
            else if (!yNResponse.equalsIgnoreCase("Y"))
            {
                System.out.println("Invalid Response;");
            }
            else if(yNResponse.equalsIgnoreCase("Y"))
            {
                do
                {
                    System.out.println("Please enter your temperature in Celsius, rounded to the nearest whole number [an integer]: ");
                    if (in.hasNextInt())
                    {
                        celTemp = in.nextInt();
                        in.nextLine();
                        if (celTemp >= 0 || celTemp <= 0)
                        {
                            validCel = true;
                        }
                        else
                        {
                            System.out.println("Error");
                        }
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("Invalid value: " + trash + "; Please enter your temperature as an integer");
                    }
                } while (!validCel);

                fahTemp = (celTemp * 1.8) + 32;
                System.out.println("Your temperature in degrees Fahrenheit is: " + fahTemp);

            }
        } while (!done);
    }
}

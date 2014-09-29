/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Kent Collins
*  @made awesome by Stefan Chao
*  @version 25 September, 2014
**/

import java.util.Scanner;

public class TemperatureChanger {

  public static void main (String[] args) {
    // TODO - scan for input in the format 175F or 18C 
    // TODO - perform correct conversion
    // TODO - print out results to the screen




System.out.println("Is the temperature you want to convert originally celsius or fahrenheit");

Scanner input = new Scanner(System.in);

String inStr = input.next();
System.out.println("Enter the temperature");

Scanner temp = new Scanner(System.in);

double tempDou = temp.nextDouble();



double x;

if(inStr.substring(0,1).equals("f")){
x = (tempDou - 32)/1.8;
System.out.print(tempDou+" degrees fahrenheit in celsius is ");
}else{
x = tempDou*(1.8)+32;
System.out.print(tempDou+" degrees celsius in fahrenheit is ");
}


System.out.println(x);
int huehuehuehuehue;



  }
  
}



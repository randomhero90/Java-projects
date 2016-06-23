import java.util.Scanner;
import java.lang.*;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.IllegalArgumentException;

/*
   8.14 various methods to messure; the volume of a sphere,
   the surface area of a sphere , the volume and suface area
   of a cylinder, and the volume and suface area of a cone.
**/

public class GeometricalCaluculations
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter radius r: ");
      double r = in.nextDouble();
      System.out.print("Enter height h: ");
      double h = in.nextDouble();
      geometry(r, h);
      
      //I have no idea what I need to import to throw this exception
      
      if (r <= 0.0)
      {
         throw new IllegalArgumentException("You cannot have a negative or zero radius");
      }
      
      if (h <= 0.0)
      {
         throw new IllegalArgumentException("You cannot have a negative or zero height");
      }

      /*
         I have imported everything I can think of to throw it,
         and it still will not compile, as if exceptionObject 
         and IllegalArguementException are variables that need
         to given arguements. (5 minutes later) Okay I figured
         out I was spelling arguements instead of arguments.
         I fixed them in my code, but left them intact in the 
         comments, you know, for a laugh.
      
      **/
   
   }
   
   public static double sphereVolume(double r)
   {     
      double volume = (4.0 / 3.0) * Math.PI * r * r * r;
      return volume;
   }
   
   public static double sphereSurface(double r)
   { 
      double surface = 4.0 * Math.PI * r * r;
      return surface;
   }
   
   public static double cylinderVolume(double r, double h)
   {
      double volume = Math.PI * r * r * h;
      return volume;
   }
   
   public static double cylinderSurface(double r, double h)
   { 
      double surface = 2.0 * Math.PI * r * h + 2.0 * Math.PI * r * r;
      return surface;
   }
   
   public static double coneVolume(double r, double h)
   {   
      double volume = (1.0 / 3.0) * Math.PI * r * r * h;
      return volume;
   }
   
   public static double coneSurface(double r, double h)
   {
      double surface = (Math.PI * r) * (r + Math.sqrt((r * r) + (h *h)));
      return surface;
   }
   
   //A method that will print the solutions, formated
   
   public static void geometry(double r, double h)
   {
      System.out.printf("Volume of your sphere is: %.2f\n ", sphereVolume(r));
      System.out.printf("Surface area of your sphere is: %.2f\n", sphereSurface(r));
      System.out.printf("Volume of your cylinder is: %.2f\n", cylinderVolume(r, h));
      System.out.printf("Surface area of your cylinder is: %.2f\n", cylinderSurface(r, h));
      System.out.printf("Volume of your cone is: %.2f\n", coneVolume(r, h));
      System.out.printf("Surface area of your cone is: %.2f\n", coneSurface(r, h));
   }
}
   
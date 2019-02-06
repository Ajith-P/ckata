import java.util.Scanner;
public class LeapYear
{
   public static void main(String[] args)
   {
      int yr;
      System.out.println("Enter an Year");
      Scanner sc = new Scanner(System.in);
      yr = sc.nextInt();

      if (((yr%4==0)&&(yr%100!=0))||(yr%400==0))
         {
         System.out.println("Specified year is a leap year");
      }
      else
         System.out.println("Specified year is not a leap year");
   }
}

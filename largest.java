import java.util.Scanner;
 class Main
{
 public static void main(String[] args)
{
     Scanner in = new Scanner(System.in);
      int x, y, z;
    System.out.println("Enter the first int");
        x =in.nextInt();
        System.out.println("Enter the second int");
         
        y =in.nextInt();
        System.out.println("Enter the third int");
        z =in.nextInt();
        if (x>y && x>z)
        {
          System.out.println("x:"+x);
        }
        else if (y>x && y>z)
        {
            System.out.println("y:"+y);
        }
            else if (z>x && z>y)
            {
                System.out.println("z:"+z);
            }
                else
                {
                System.out.println("invalid Number");
            }
        
        
}
}

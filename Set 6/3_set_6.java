import java.util.Scanner;
interface Shape{
    void cal_area(int b,int h);
}
class Triangle implements Shape
{
    public void cal_area(int b,int h)
    {
        float ans=(h*b)/2;
        System.out.println("The area is "+ans);
    }
}
class Area
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    Shape obj=new Triangle();
    System.out.println("Enter the b");
    int b=in.nextInt();
    System.out.println("Enter the h");
    int h=in.nextInt();
    obj.cal_area(b,h);
    }
}
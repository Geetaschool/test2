import java.util.Scanner;
class Circle
{
double r;
double area,crm;
public  Circle(double r)
{
this.r=r;
}
/*void acceptData()
{
System.out.println("Enter radius :");
Scanner sc=new Scanner(System.in);
r=sc.nextInt();
}*/
void displayData()
{
System.out.println("Radius :"+r);
}
void getArea()
{
area=3.14*r*r;
System.out.println("Area of Circle :"+area);
}
void getCircm()
{
crm=3.14*2*r;
System.out.println("Circumfrence of Circle :"+crm);
}
public static void main(String args[])
{
int r1;
System.out.println("Enter radius :");
Scanner sc=new Scanner(System.in);
r1=sc.nextInt();
Circle cr=new Circle(r1);
//cr.acceptData();
cr.displayData();
cr.getArea();
cr.getCircm();
}
}






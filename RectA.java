import java.util.Scanner;
class RectA{
int w;
int h;
public RectA(int w,int h)
{
this.w=w;
this.h=h;
}

public int getArea()
{
 int area=w*h;
return area;
}
public static void  main(String args[])
{
RectA r=new RectA(5,6);
RectA r1=new RectA(7,6);
int a1=r.getArea();
int a2=r1.getArea();
System.out.println("Area is :"+a1);
System.out.println("Area is :"+a2);

}
}

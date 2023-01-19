import java.util.Scanner;
class Stud{
String n;
int c;
int s1;
int s2;
int s3;
int s4;
char sec;
int area;
public Stud(int sb1, int sb2,int sb3,int sb4)
{
//n=nm;
//c=cs;
//sec=section;
s1=sb1;
s2=sb2;
s3=sb3;
s4=sb4;
}
public int getTotal()
{
 area=s1+s2+s3+s4;
return area;
}
public double getAvg()
{
double avg=area/4;
return avg;
}
void acceptData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name : ");
n=sc.nextLine();
System.out.println("Enter class : ");
c=sc.nextInt();
System.out.println("Enter Section : ");
sec=sc.next().charAt(0);
}
public static void  main(String args[])
{
Stud r1=new Stud(8,2,5,3);
//Stud s2=new Stud(2,7,4,5);
r1.acceptData();
int a1=r1.getTotal();
double a2=r1.getAvg();
System.out.println("Area is :"+a1);
System.out.println("Average is :"+a2);
}
}

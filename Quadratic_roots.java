import java.util.*;
class Quadratic
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
System.out.println("enter a,b,c values");
Double a,b,c,d;
a=ob.nextDouble();
b=ob.nextDouble();
c=ob.nextDouble();
d=(b*b)-(4*a*c);
Double r1,r2;
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
if(d>0)
{
System.out.println("the roots are real and unequal\nRoot1:"+r1+"\nRoot2:"+r2);
}
else if(d==0)
{
System.out.println("the roots are real and equal\nRoot1:"+r1+"\nRoot2:"+r2);
}
else
{
System.out.println("the roots are unequal   and imaginary\nRoot1:"+r1+"\nRoot2:"+r2);
}
}
}
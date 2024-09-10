class A
{
void fact()
{
int fact=1,n=5;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial of a given number:"+fact);
}
}
class B extends A
{
void odd_even()
{
int n=10;
if(n%2==0)
System.out.println("Given number is even");
else
System.out.println("Given number is odd");
}
}
class Singel_inheritance
{
public static void main(String args[])
{
B ob=new B();
ob.fact();
ob.odd_even();
}
}
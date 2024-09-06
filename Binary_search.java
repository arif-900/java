 import java.util.*;
class A
{
int binary(int a[],int key)
{
int l=0,h=a.length-1;
while(l<=h)
{
int mid=(l+h)/2;
if(a[mid]==key)
return mid;
else if(a[mid]<h)
l=mid+1;
else
h=mid-1;
}
return -1;
}
}
class Binary_search
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.println("Enter the array elements");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter key value");
int key=sc.nextInt();
A ob=new A();
int res=ob.binary(a,key);
if(res==-1)
System.out.println("element is not found");
else
System.out.println("Element is found at index:"+res);
}
}

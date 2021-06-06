import java.util.Scanner;
public class Armstrong 
{
public static void main(String[] args)
{
int num,r,sum=0,i;
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
num = sc.nextInt();
i=num;
while(n!=0)
{
r = num%10;
num = num/10;
sum = sum+(r*r*r);
}
if(i==sum)
System.out.println("given number is Armstrong number");
else
System.out.println("given number is not Armstrong number");
}
}
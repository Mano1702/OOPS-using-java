import java.io.*;
import java.util.*;
class PatternC
{
public static void main(String args[])
{
	int n;
	
Scanner S=new Scanner(System.in);
 n=S.nextInt();

for(int i=1;i<=n;i++,System.out.println("\n"))
{


for(int j=1;j<=n;j++)
{
	if(i==1&&j==5&&j==6&&j==7&&j==8)
	{
		System.out.println("#");
	}
	
else 
{
System.out.println(" ");	
}
}
}
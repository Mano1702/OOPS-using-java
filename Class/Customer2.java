import java.io.*;
class Customer2
{

       int cus_id;
    String cus_name;
	float ratings;
public static void main(String args[])
{
	Customer2 c1 = new Customer2();
	c1.cus_id=101;
	c1.cus_name="mano";
	c1.ratings=3.14f;
	
	System.out.println(c1.cus_id);
		System.out.println(c1.cus_name);
			System.out.println(c1.ratings);
			
}
}
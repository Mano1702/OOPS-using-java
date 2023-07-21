import java.io.*;
class Customer23
{

    int cus_id;
    String cus_name;
	float ratings;
}

class TestCustomer{
	
public static void main(String args[])
{
	Customer23 c1 = new Customer23();
		Customer23 c2 = new Customer23();

	
	c1.cus_id=101;
	c1.cus_name="mano";
	c1.ratings=3.14f;
	c2.cus_id=102;
	c2.cus_name="swarna";
	c2.ratings=2.14f;
	
	System.out.println(c1.cus_id);
		System.out.println(c1.cus_name);
			System.out.println(c1.ratings);
			System.out.println(c2.cus_id);
		System.out.println(c2.cus_name);
			System.out.println(c2.ratings);
			
}
	
}
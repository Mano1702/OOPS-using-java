import java.io.*;
class Customer43
{

    int cus_id;
    String cus_name;
	float ratings;

void insertRecord(int i,String n,float r)
{
cus_id=i;
cus_name=n;
ratings=r;
}
void displayInformation()
{
System.out.println(cus_id+" "+cus_name+" "+ratings);
}
}
class Testcustomer43{
	
public static void main(String[] args)
{
	Customer43 c1 = new Customer43();
		Customer43 c2 = new Customer43();

	
    c1.insertRecord(111,"mano",3.17f);
	c2.insertRecord(112,"viswa",4.17f);

	
	c1.displayInformation();
	c2.displayInformation();
	}
	}
	

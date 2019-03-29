package org.edu;

public class Engineering extends Arts 
{
public void bE()
{
	System.out.println("BE in Engineering");}
public void bTech()
{
	System.out.println("BTech in Engineering");}
public static void main(String[] args) 
{
	Engineering eng = new Engineering();
	eng.bA();
	eng.bBa();
	eng.bEd();
	eng.bsc();
	eng.ug();
	eng.pg();
	eng.bE();
	eng.bTech();
	SingleTonClass e1= SingleTonClass.createObject();
	e1.empId(175);
	e1.empName();
	e1.empPhone();
}

}



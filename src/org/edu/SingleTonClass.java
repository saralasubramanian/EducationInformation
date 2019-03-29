package org.edu;

public class SingleTonClass {

	static private SingleTonClass s =null;

	private SingleTonClass()
	{
	}

public static SingleTonClass createObject() {
		if (s==null)
		{s = new SingleTonClass();
}
System.out.println(s);
return s;
}
public void empName()
{
	System.out.println("name");}
public void empPhone()
{
	System.out.println("phone");
	}
public void empId(int i)
{
	System.out.println(i);
}
}
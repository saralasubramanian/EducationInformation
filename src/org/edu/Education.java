package org.edu;

public class Education
{
	public void ug()
	{
		System.out.println("UG in Education");
	}
	public void pg()
	{
		System.out.println("PG in education");
		}
	
public static void main(String[] args)
{
	Education edu = new Education();
			edu.ug();
			edu.pg();
			SingleTonClass e= SingleTonClass.createObject();
			e.empId(1);
			e.empName();
			e.empPhone();
}
}

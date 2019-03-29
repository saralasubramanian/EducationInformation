package org.edu;

public class Medicine extends Engineering
{
	public void phySiyo()
	{System.out.println("Psysiotheraphy in Medicine");
	}
	public void dental()
	{System.out.println("Dental in Medicine");
	}
	public void mBBs()
	{System.out.println("MBBS in Medicine");
	}
	public static void main(String[] args)
	{
		Medicine med = new Medicine();
		med.bA();
		med.bBa();
		med.bEd();
		med.bsc();
		med.ug();
		med.pg();
		med.bE();
		med.bTech();
		med.phySiyo();
		med.dental();
		med.mBBs();
	}
}

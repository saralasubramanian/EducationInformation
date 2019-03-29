package org.edu;

public class Arts extends Education {
public void bsc()
{
	System.out.println("Bsc in Arts");
	}
public void bEd()
{
	System.out.println("BEd in Arts");
	}
public void bA()
{
	System.out.println("BA in Arts");
	}
public void bBa()
{
	System.out.println("BBA in Arts");
	}
public static void main(String[] args) {
	Arts art = new Arts();
	art.bA();
	art.bBa();
	art.bEd();
	art.bsc();
	art.ug();
	art.pg();
}
}

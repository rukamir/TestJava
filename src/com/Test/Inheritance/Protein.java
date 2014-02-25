package com.Test.Inheritance;

public class Protein extends Product implements IProduct{
	private int Calories;
	
	public Protein(int qnt, String units, float price) {
		System.out.println("Protein Item Created!");
		super.m_iQuantity = qnt;
		super.m_sUnit = units;
		super.m_fPrice = price;
		
	}
}

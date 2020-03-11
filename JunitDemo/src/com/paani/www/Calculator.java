package com.paani.www;
import java.lang.*;

public class Calculator {
	public double  add (double a , double b){
		return a+b;
	}
	public double  subtract(double a , double b){
		return a-b;
	}
	public double  multiply(double a , double b){
		return a*b;
	}
	public double  divide(double a , double b){
		if(b==0){
			throw new ArithmeticException();
		}
		return a/b;
	}
	
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println(obj.add(10,20));
		System.out.println(obj.subtract(20,10));
		System.out.println(obj.multiply(2,3));
		System.out.println(obj.divide(10,5));
	}
}

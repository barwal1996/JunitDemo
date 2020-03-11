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
		add(10,20);
		subtract(20,10);
		multiply(2,3);
		divide(10,5);
	}
}

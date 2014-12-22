package com.codenvy.example.entity;

import com.codenvy.example.exception.ComplexRootException;

public class CalculatorOfSquareRoot {

  private double a;
  private double b;
  private double c;
  
  private double solveRootOfDiscriminant() throws ComplexRootException {
    double result = 0;
    if (!Double.isNaN(Math.sqrt(b*b - 4*a*c))) {
    	 result = Math.sqrt(b*b - 4*a*c); 
    } else {
       throw new ComplexRootException();
    }
    return result;
  }

  public double solveRoot1() throws ComplexRootException {
    return (-b + solveRootOfDiscriminant())/2*a;
  }
  
  public double solveRoot2() throws ComplexRootException {
    return (-b - solveRootOfDiscriminant())/2*a;
  }
  
  public void setA(double a) {
    this.a = a;
  }
  
  public void setB(double b) {
    this.b = b;
  }
  
  public void setC(double c) {
    this.c = c;
  }
}

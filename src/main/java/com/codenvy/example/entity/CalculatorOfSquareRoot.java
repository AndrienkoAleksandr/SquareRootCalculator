package com.codenvy.example.entity;

public class CalculatorOfSquareRoot {

  private double a;
  private double b;
  private double c;
  
  private double solveRootOfDiscriminant() {
    return Math.sqrt(b*b - 4*a*c);
  }
  
  public double solveRoot1() {
    return (-b + solveRootOfDiscriminant())/2*a;
  } 
  
  public double solveRoot2() {
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

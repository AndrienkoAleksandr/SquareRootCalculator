package com.codenvy.example.spring;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.codenvy.example.entity.CalculatorOfSquareRoot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingController implements Controller
{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      CalculatorOfSquareRoot calculator = new CalculatorOfSquareRoot();
      String coefA = request.getParameter("a");
      String coefB = request.getParameter("b");
      String coefC = request.getParameter("c");
      String result = "";
      if (coefA != null && coefB != null && coefC != null) {
        calculator.setA(Double.parseDouble(coefA));
        calculator.setB(Double.parseDouble(coefB));
        calculator.setC(Double.parseDouble(coefC)); 
        result = "Result=" + calculator.solveRoot1() + " " + calculator.solveRoot2();
      }
      
      ModelAndView view = new ModelAndView("hello_view");
      view.addObject("result", result);
      return view;
   }
}

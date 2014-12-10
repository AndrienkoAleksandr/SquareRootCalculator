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
      calculator.setA(Double.parseDouble(request.getParameter("a")));//we need double argument//autocomplete cleared word request!!!!!
      calculator.setA(Double.parseDouble(request.getParameter("b")));
      calculator.setA(Double.parseDouble(request.getParameter("c")));
      
      String result = "Result=" + calculator.solveRoot1() + " " + calculator.solveRoot2();

      ModelAndView view = new ModelAndView("hello_view");
      view.addObject("result", result);
      return view;
   }
}

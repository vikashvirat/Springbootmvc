package com.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayController 
{
@RequestMapping("/demo")
//public String disp()
//{
//	return "display.jsp";
//}
public ModelAndView disp(HttpServletRequest request, HttpServletResponse response)
{
	String name=request.getParameter("nm");
	ModelAndView mv = new ModelAndView();
	mv.setViewName("display.jsp");
	//return "display.jsp";
	mv.addObject("name", name);
	return mv;	
}
}

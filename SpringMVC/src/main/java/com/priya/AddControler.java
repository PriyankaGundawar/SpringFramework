package com.priya;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.priya.service.AddService;


@Controller
public class AddControler {
	
//	@RequestMapping("/add")
//	public String add() {
//		return "display.jsp";
//	}
	@RequestMapping("/add")
	//public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j,HttpServletRequest request, HttpServletResponse response) {
		
		//Requestparam is to directly fetch the value and assign to variable. no need to use below two lines of code.
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
//		int k = i+j;
		
		AddService as = new AddService();
		int k = as.addition(i, j);
		
		ModelAndView mv = new ModelAndView();
		//mv.setViewName("display.jsp");
		mv.setViewName("display");
		mv.addObject("result",k);
		
		return mv;
	}

}

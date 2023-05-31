package com.priya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("add")
	public ModelAndView addition(@RequestParam("t1") int m, @RequestParam("t2") int n) {
		
		ModelAndView mv = new ModelAndView();
		int k=m+n;
		
		mv.addObject("res",k);
		mv.setViewName("result.jsp");
		
		return mv;
	}

}

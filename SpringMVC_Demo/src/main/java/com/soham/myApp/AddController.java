package com.soham.myApp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.user.form.User;

@Controller
public class AddController {

//	@RequestMapping("/index")
//	public String display () {
//		
//		System.out.println("Controller Invoked !!");
//		return "index";
//	}
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int i=Integer.parseInt(request.getParameter("t1"));
		int j =Integer.parseInt(request.getParameter("t2"));
		
		int k =i+j;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("sumResult",k);
		return mv;
	}
	
	
	
	@RequestMapping(value="/home" , method=RequestMethod.GET)
	public String home(Locale locale,Model model) {
		System.out.println("Home Page Requested , locale =" + locale);
		Date date=new Date();
		DateFormat dateFormat =DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String FormattedDate = dateFormat.format(date);
		System.out.println("Date=" + FormattedDate);
		
		model.addAttribute("serverTime",FormattedDate);
	
		return  "home" ;
	}
	
	@RequestMapping(value="/user" , method=RequestMethod.POST)
	public String user(@Validated User user,Model model) {
		System.out.println("User Requested Page");
		model.addAttribute("userName", user.getUserName());
		return "user";
		
	}
}

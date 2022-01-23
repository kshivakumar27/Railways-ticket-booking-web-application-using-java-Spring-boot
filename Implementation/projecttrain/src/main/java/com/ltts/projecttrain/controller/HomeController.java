package com.ltts.projecttrain.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//import com.ltts.projecttrain.bo.TrainBo;
import com.ltts.projecttrain.model.Train;

@RestController
public class HomeController {
	
	
	
	@Autowired
//	TrainBo td;
	
	
	
	@RequestMapping("/")
	public ModelAndView viewHomePage() {
		return new ModelAndView ("index") ;
	}
	@RequestMapping("/addtraininfo")
	public ModelAndView viewInfoPage() {
		return new ModelAndView ("addtraininfo") ;
	}
	@RequestMapping(value="insertinfo", method=RequestMethod.POST)
	public ModelAndView m1(HttpServletRequest request) {
		
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.scan("com.llts.projecttrain");
		ac.refresh();
		
		int id=Integer.parseInt(request.getParameter("uid"));
		String name=request.getParameter("uname");
		String trainnames=request.getParameter("trainnames");
		String timings=request.getParameter("timings");
		String paymenttype=request.getParameter("paymenttype");
		
		Train t=ac.getBean(Train.class);
	//	Train t=new Train(id,name,trainnames,timings,paymenttype);
		
		t.setId(id);
		t.setName(name);
		t.setTrainnames(trainnames);
		t.setTimings(timings);
		t.setPaymenttype(paymenttype);
		
		
		
		
		System.out.println(t);
		//System.out.println(name+" $$ "+id+" $$ "+trainnames+" $$ "+timings+" $$ "+paymenttype);
		
		
	//	td.save(t);
		return new ModelAndView ("success") ;
	}
	
	
}

package minh137.net.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("index controller가 실행됨.");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","안녕, 나는 스프링MVC야!");
		mv.setViewName("index");
		
		return mv;
	}

}

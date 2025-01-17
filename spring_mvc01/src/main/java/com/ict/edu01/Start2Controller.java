package com.ict.edu01;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
	
public class Start2Controller implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		// servlet-context.xml 되돌아 갔다가 ViewResolver 에 들어가는 이름
		// (단순하게 말하면 결과를 보여줄 jsp 이름)
		
		// 방법1)
	//	ModelAndView mv = new ModelAndView();
	//	mv.setViewName(뷰네임 = 되돌아갈 jsp 이름 = "result1");
		mv.setViewName("result2");
		
		// 방법2
	//	ModelAndView mv = new ModelAndView("result1");
		
		String[] dogName = {"땅콩이", "진돌이", "말복이", "하오"};
		mv.addObject("dogName", dogName);
		
		ArrayList<String> catName = new ArrayList<String>();
		catName.add("뽀삐");
		catName.add("나비");
		catName.add("달콩이");
		catName.add("까망이");
		mv.addObject("catName", catName);
		
		return mv;
	}
}
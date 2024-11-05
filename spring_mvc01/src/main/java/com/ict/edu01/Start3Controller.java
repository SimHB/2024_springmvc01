package com.ict.edu01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

// 어노테이션으로 @Controller를 하면 자동으로 Spring에서 자동으로 Controller로 인식한다.

@Controller
public class Start3Controller {
	// URL 매핑이란
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// @RequestMapping(value = "/", method = RequestMethod.POST)
	
	// @RequestMapping("URL")	// Get,Post 애매할 때 사용
	// @GetMapping("URL")		// Get방식 사용할 때 <a href>, <form method="get">
	// @PostMapping("URL")		// Post방식 사용할 때 <form method="post">
	
	// 해당 메서드는 URL 매핑이 와야 실행된다.
	// exec(인자) : 인자는 필요할때만 사용하면 된다.
	@GetMapping("/start3")	// a 링크는 get 방식 이므로 오류 발생
	public ModelAndView exec(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("day01/result3");
		mv.addObject("city", "서울");
		return mv;
	}
}
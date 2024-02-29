package SIT_SEMI_PROJECT.SYH.syh.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SyhController {
	
	@RequestMapping(value = "syh/main.do")
	public ModelAndView Main() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("syhMain");
		return mav;
	}
	
	@RequestMapping(value = "syh/testPage.do")
	public ModelAndView testPage() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("testPage");
		return mav;
	}
	
	
	@RequestMapping(value = "syh/numList.do", produces = "application/json; charset=utf-8"
			, consumes = "application/json")
	// 응답 데이터 타입, 요청 데이터의 타입을 Ajax와 맞춰주어야 한다.
	@ResponseBody
	public List<Integer> numList(@RequestBody List<Integer> numList) {
		
		return numList;
	}
	
	/*
	@RequestMapping(value = "syh/ex2.do")
	public ModelAndView ex2() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("ex2");
		return mav;
	}
	*/
}

package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.DataBean;

@Controller
public class TestController {
	/*
	@PostMapping("/test1")
	public String test1(DataBean bean, Model model) { // modelAttribute ������
		return "test1";
	}*/
	
	/*
	@PostMapping("/test1")
	public String test1(@ModelAttribute DataBean bean) {
		bean.getData1();
		bean.getData2();
		return "test1";
	}*/
	
	@PostMapping("/test1")
	public String test1(DataBean bean, Model model) {
		model.addAttribute("dto", bean); // dto��� �̸����� ��ü �ڵ�����
		return "test1";
	}
}

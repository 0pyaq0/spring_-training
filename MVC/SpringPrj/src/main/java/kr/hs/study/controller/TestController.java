package kr.hs.study.controller;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	//1. 1���� 10������ ��
	@GetMapping
	public void result() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		System.out.println("���� �Է��Ͻÿ� : " + dan);
	}
}

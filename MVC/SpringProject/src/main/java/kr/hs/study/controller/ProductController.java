package kr.hs.study.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.productDTO;
import kr.hs.study.service.productService;

@Controller
public class ProductController {
	
	@Autowired
	productService productservice;

	@GetMapping("/shop")
	public String shop() {
		return "product/list";
	}
	
	@GetMapping("/product/add")
	public String add_form() {
		return "product/add_form";
	}
	
	@PostMapping("/product/insert_product")
	public String insert(productDTO dto) {
		String filename = dto.getProductPhoto().getOriginalFilename();
		System.out.println("filename : " + filename);
		System.out.println("filename : " + dto.getProductPhoto());
		String path = "C:\\spring_core\\MVC\\productImg";
		try {
			new File(path).mkdirs(); // ���丮 ����
			dto.getProductPhoto().transferTo(new File(path+filename));
			// �ӽ� ���丮�� ����� ������ ������ ���丮�� ����
		}catch(Exception e) {
			System.out.println(e);
		}
		dto.setProductUrl(filename);
		productservice.insert(dto);
		return "result";
	}
}

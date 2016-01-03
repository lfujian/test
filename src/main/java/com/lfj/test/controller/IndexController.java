package com.lfj.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lfj
 * 首页
 */
@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String Index() {
		return "redirect:/index";
	}
}

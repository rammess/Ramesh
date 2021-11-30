package com.ramesh.pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@GetMapping("/")
	ModelAndView getRoot(Model model) {
		System.out.println("Here");
		model.addAttribute("message", "Thank you for visiting");
		//return new ModelAndView("forward:landingPage");
		return new ModelAndView("/pages/landingPage");

	}

	@GetMapping("/pages/{pageName}")
	ModelAndView getPage(@PathVariable String pageName) {
		return new ModelAndView(
				String.format("/pages/%s", pageName));
	}

}

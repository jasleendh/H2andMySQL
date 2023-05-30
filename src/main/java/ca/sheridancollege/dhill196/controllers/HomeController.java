package ca.sheridancollege.dhill196.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.dhill196.beans.Course;
import ca.sheridancollege.dhill196.repositories.CourseRepository;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HomeController {
	
	private CourseRepository courseRepository;

	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("course", new Course());
		return "index";
	}
	
	@PostMapping("/sendInfo")
	public String sendInfo(Model model, @ModelAttribute Course course) {
		
		courseRepository.save(course);
		model.addAttribute("courseList", courseRepository.findAll());
		model.addAttribute("course", new Course());
		return "index";
	}
}

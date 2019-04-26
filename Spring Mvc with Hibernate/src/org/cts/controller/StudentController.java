package org.cts.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.cts.bean.Student;
import org.cts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@Autowired
	StudentService service;

	@RequestMapping("/showForm")
	public String getForm(Model model) {
		model.addAttribute(new Student());
		return "student";
	}

	// @RequestMapping("/processForm")
	// public String processForm(HttpServletRequest request, Model model) {
	// int sid = Integer.parseInt(request.getParameter("sid"));
	// String name = request.getParameter("name");
	// String address = request.getParameter("address");
	// // model.addAttribute("sid", sid);
	// // model.addAttribute("name", name);
	// // model.addAttribute("address", address);
	// Student student = new Student(sid, name, address);
	// // student.setSid(sid);
	// // student.setName(name);
	// // student.setAddress(address);
	// service.registerStudent(student);
	// model.addAttribute("msg", "Inserted Successfully");
	//
	// return "student-confirm";
	// }

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student,
			Model model) {
		service.registerStudent(student);
		model.addAttribute("stud", student);
		return "student-confirm";
	}

	@ModelAttribute("countryOptions")
	public Map<String, String> getCountry() {
		Map<String, String> countryOptions = new LinkedHashMap<>();
		countryOptions.put("In", "India");
		countryOptions.put("UK", "London");
		return countryOptions;
	}

}

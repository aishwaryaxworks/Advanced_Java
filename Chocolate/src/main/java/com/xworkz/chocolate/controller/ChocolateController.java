package com.xworkz.chocolate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.service.ChocolateService;

@Controller
@RequestMapping("/chocolate")
public class ChocolateController {

	@Autowired
	private ChocolateService serv;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveChocolate(ChocolateDTO dto, Model model) {

		boolean save = serv.validateAndSave(dto, model);
		if (save) {
			return "Success";
		}
		return "Chocolate";
	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String findById(@RequestParam int id, Model model) {

		ChocolateDTO found = serv.findById(id);
		if (found != null) {
			model.addAttribute("dto", found);
			return "Success";
		}
		return "Chocolate";

	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String readAll(Model model) {
		List<ChocolateDTO> readDto = serv.readAll();
		if (readDto != null) {
			model.addAttribute("dto", readDto);
			return "Read";
		}
		model.addAttribute("noDtoFound", "Data not found");
		return "Chocolate";
	}

	@RequestMapping(value = "/findByName", method = RequestMethod.GET)
	public String findByName(@RequestParam String name, Model model) {

		ChocolateDTO found = serv.findByName(name, model);
		if (found != null) {
			model.addAttribute("dto", found);
			return "Find";
		}
		model.addAttribute("nameNotFound", "Name is not found");
		return "Chocolate";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateQuantityByName(@RequestParam int quantity, @RequestParam String name, Model model) {
		boolean isUpdated = serv.updateQuantityByName(quantity, name);
		if (isUpdated) {
			model.addAttribute("isUpdated", "Quantity Updated");
			return "Chocolate";
		} else {
			model.addAttribute("isUpdated", "Quantity Not Updated");
			return "Chocolate";
		}

	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteByName(@RequestParam String name, Model model) {
		boolean delete = serv.deleteByName(name);
		if (delete) {
			model.addAttribute("deleteStatus", name + "Deleted");
			return "Chocolate";
		}
		model.addAttribute("deleteStatus", name + "Not deleted");
		return "Chocolate";
	}

}

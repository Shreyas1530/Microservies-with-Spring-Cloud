package com.panda.telecom.plans.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.panda.telecom.plans.dto.PlanDTO;
import com.panda.telecom.plans.service.PlanService;
import com.sun.tools.sjavac.Log;

@RestController
@EnableAutoConfiguration
@CrossOrigin
public class PlanController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlanService planService;

	// Fetches all plan details
	@GetMapping(value = "/plans",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PlanDTO> getAllPlans() {
		logger.info("Inside plans service");
		return planService.getAllPlans();
	}
	// To get a plan details based on plan id
	@GetMapping(value = "/plans/{planId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public PlanDTO getSpecificPlan(@PathVariable("planId") Integer planId) {
		return planService.getPlan(planId);
	}
	
	@GetMapping("/hi")
	public String getHi() {
		return "Hi";
	}
	
	@GetMapping("/")
	public String getAllHi() {
		Log.info("Inside getAllHi");
		return "All Hi";
	}


}

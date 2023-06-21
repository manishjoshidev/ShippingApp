package com.LiveEasy.TruckShippingApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LiveEasy.TruckShippingApp.Entity.PayLoadEntity;
import com.LiveEasy.TruckShippingApp.Service.LoadService;

import java.util.List;

@RestController
public class MyController {
	
	private LoadService loadService;

	@GetMapping("/")
	public String home() {
		return "This is the home page";
	}
	
	@GetMapping("/loads")
	public List<PayLoadEntity> getLoads() {
		return loadService.getLoads();
	}
	
	@GetMapping("/load/{shipperId}")
	public PayLoadEntity getLoadByShipperId(@PathVariable String shipperId) {
		return loadService.getLoadByShipperId(Long.parseLong(shipperId));
	}
	
	@PostMapping("/load")
	public PayLoadEntity addLoad(@RequestBody PayLoadEntity payloadEntity) {
		return loadService.addLoad(payloadEntity);
	}
	
}


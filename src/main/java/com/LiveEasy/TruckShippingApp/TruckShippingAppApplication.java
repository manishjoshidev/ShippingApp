package com.LiveEasy.TruckShippingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.LiveEasy.TruckShippingApp.Dao.PayLoadDao;

@SpringBootApplication
public class TruckShippingAppApplication implements CommandLineRunner {
	@Autowired
	private PayLoadDao payLoadDao;

	public static void main(String[] args) {
		SpringApplication.run(TruckShippingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.payLoadDao.createTable();
		int update = this.payLoadDao.insertData(null, null);
		System.out.println(update);
	}
}

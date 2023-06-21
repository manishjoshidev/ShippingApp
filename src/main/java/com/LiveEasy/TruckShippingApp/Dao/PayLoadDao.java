package com.LiveEasy.TruckShippingApp.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PayLoadDao {
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PayLoadDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createTable() {
		String query = "CREATE TABLE IF NOT EXISTS PayLoad (ShipperID SERIAL PRIMARY KEY, LoadingPoint VARCHAR(255), UnloadingPoint VARCHAR(255), ProductType VARCHAR(255), TruckType VARCHAR(255), NoOfTrucks INT, Weight INT)";
		int update = this.jdbcTemplate.update(query);
		System.out.println(update);
	}
	
	public int insertData(String loadingPoint, String unloadingPoint) {
		String query = "INSERT INTO PayLoad (LoadingPoint, UnloadingPoint,ProductType,TruckType,NoOfTrucks,weight) VALUES (?,?,?,?,?,?)";
		int update = this.jdbcTemplate.update(query, loadingPoint, unloadingPoint);
		System.out.println(update);
		return update;
	}
}

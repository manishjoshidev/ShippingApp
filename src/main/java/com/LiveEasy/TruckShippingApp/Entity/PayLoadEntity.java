package com.LiveEasy.TruckShippingApp.Entity;



public class PayLoadEntity {
	private long shipperId;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private  double weight;
   
	public PayLoadEntity(long shipperId, String loadingPoint, String unloadingPoint, String productType,
			String truckType, int noOfTrucks, double weight) {
		super();
		this.shipperId = shipperId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight; 
		
	}
	
	public PayLoadEntity() {
		super();
		
	}

    public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	   @Override
	public String toString() {
		return "PayLoadEntity [shipperId=" + shipperId + ", loadingPoint=" + loadingPoint + ", unloadingPoint="
				+ unloadingPoint + ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks="
				+ noOfTrucks + ", weight=" + weight;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
	

}

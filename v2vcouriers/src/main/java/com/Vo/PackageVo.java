package com.Vo;

import java.sql.Date;

public class PackageVo {
	private long consignmentId;
	private String senderAddress;
	private String receiverAddress;
	private String currentLocation;
	private String packageStatus;
	private Date acceptDate;
	private Date currentDate;
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	private double packageWeight;
	private double cost;
	private int status;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
		public long getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(long consignmentId) {
		this.consignmentId = consignmentId;
	}
		public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public String getPackageStatus() {
		return packageStatus;
	}
	public void setPackageStatus(String packageStatus) {
		this.packageStatus = packageStatus;
	}
	public Date getAcceptDate() {
		return acceptDate;
	}
	public void setAcceptDate(Date acceptDate) {
		this.acceptDate = acceptDate;
	}
	public double getPackageWeight() {
		return packageWeight;
	}
	public void setPackageWeight(double packageWeight) {
		this.packageWeight = packageWeight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}

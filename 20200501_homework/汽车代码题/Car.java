package com.achter.homework;
/**
 * 车类
 * @author Achter
 * @date   2020年5月5日
 *
 */
public class Car {
	
	//成员变量
	private String brand;//品牌
	private String carType;//车型
	private int price;//价格
	private int fuel;//油耗
	private int kilometer;//里程数
	private int fuelTankCapa;//油箱容积
	
	
	//set()与get()方法
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public int getKilometer() {
		return kilometer;
	}
	public void setKilometer(int kilometer) {
		this.kilometer = kilometer;
	}
	public int getFuelTankCapa() {
		return fuelTankCapa;
	}
	public void setFuelTankCapa(int fuelTankCapa) {
		this.fuelTankCapa = fuelTankCapa;
	}
	
	
	//构造方法
    public Car() {
	}
	public Car(String brand, String carType, int price, int fuel, int kilometer, int fuelTankCapa) {
		this.brand = brand;
		this.carType = carType;
		this.price = price;
		this.fuel = fuel;
		this.kilometer = kilometer;
		this.fuelTankCapa = fuelTankCapa;
	}

}

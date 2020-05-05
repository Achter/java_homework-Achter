package com.achter.homework;
/**
 * 高铁类
 * @author Achter
 * @date   2020年5月4日
 *
 */
public class Train {
	
	//成员变量
	private String originSatation;//起点站
	private String destination;//终点站
	private String trainNums;//列车车次
	private String seatType;//座位类型
	
	//set() get()设置
	public String getOriginSatation() {
		return originSatation;
	}
	public void setOriginSatation(String originSatation) {
		this.originSatation = originSatation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrainNums() {
		return trainNums;
	}
	public void setTrainNums(String trainNums) {
		this.trainNums = trainNums;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	
	
	//构造方法
	public Train() {
	}
	public Train(String originSatation, String destination) {
		this.originSatation = originSatation;
		this.destination = destination;
	}
	public Train(String originSatation, String destination, String trainNums) {
		this.originSatation = originSatation;
		this.destination = destination;
		this.trainNums = trainNums;
	}
	public Train(String originSatation, String destination, String trainNums, String seatType) {
		super();
		this.originSatation = originSatation;
		this.destination = destination;
		this.trainNums = trainNums;
		this.seatType = seatType;
	}
	
}

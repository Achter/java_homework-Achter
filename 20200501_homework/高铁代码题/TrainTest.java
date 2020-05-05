package com.homework.test;

import com.achter.homework.Train;

import sun.swing.plaf.synth.StyleAssociation;



/**
 * 火车测试类
 * @author Achter
 * @date   2020年5月4日
 *问题1
 */
public class TrainTest {
	private static String[] stationG7029 = {"南京","镇江","丹阳","常州","无锡","苏州","上海"};
	private static double[] firstPrice = {0,44.5,64.5,99.5,129.5,159.5,219.5};
	private static double[] secondPrice = {0,29.5,39.5,64.5,79.5,99.5,139.5};
	private static String[] seatType={"一等座","二等座"};
	
	public static void main(String[] args) {
		Train train = new Train();
		train.setOriginSatation("无锡");
		train.setDestination("苏州");
		
		train.setSeatType("二  等座");
		for(int i=0;i<stationG7029.length;i++) {
			for(int j=0;j<stationG7029.length;j++) {
					if(train.getOriginSatation().equals(stationG7029[i])&&train.getDestination().equals(stationG7029[j])) {
						if((train.getSeatType().replace(" ", "")).equals("一等座")) {
						   System.out.println(firstPrice[j]-firstPrice[i]);
					    }else if((train.getSeatType().replace(" ", "")).equals("二等座")) {
					    	System.out.println(secondPrice[j]-secondPrice[i]);
					    }
					}
				
			}
		   
		}	   

	}

}

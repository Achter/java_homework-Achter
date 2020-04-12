package com.Achter.homework;
/**
 * 
 * @author Achter
 * @date   2020年4月12日
 *
 */
public class TrainTickets {

	public static void main(String[] args) {
		
		String passName = "Achter";
		String idType = "身份证";
		String idNumb = "111111111111111111";
		double tickPrice = 345.67;
        int traiNumb = 1234;
        String depaStation = "苏州";
        String termStation = "青岛";
        String depaTime = "2020/4/12  10:05";
        String arriTime = "2020/4/13  11:11";
        String seatNumb = "3车01号";
        
        System.out.println("火车票");
        System.out.println("乘客姓名:"+passName);
        System.out.println("证件类型:"+idType);
        System.out.println("证件号码:"+idNumb);
        System.out.println("票价:"+tickPrice+"元");
        System.out.println("列车班次:"+traiNumb+"次");
        System.out.println("出发站:"+depaStation);
        System.out.println("终点站:"+termStation);
        System.out.println("出发时间:"+depaTime);
        System.out.println("到达时间:"+arriTime);
        System.out.println("座位号:"+seatNumb);
			
		 
       
	}

}

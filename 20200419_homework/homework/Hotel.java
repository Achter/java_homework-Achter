package com.achter.homework;

import java.util.regex.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Hotel {
	
	public static void main(String[] args) {
		
		String[] name= {"格林豪泰苏州火车站南广场拙政园商务酒店","格林豪泰苏州火车站南广场拙政园商务酒店","格林豪泰苏州火车站南广场拙政园商务酒店",
				"格雅苏州工业园区金鸡湖东方之门酒店","格林豪泰苏州漕湖工业园智选酒店"};
        String[] roomType = {"大床房","标间","豪华双床房","豪华双床房","高级大床房"};
		String customerName = ".*酒店.*";//匹配搜索
		String customerRoomType = ".*双床房.*";

        //搜索出相关要求的酒店
        customerName=customerName.replace(" ", "");
        customerRoomType=customerRoomType.replace(" ", "");
        System.out.println("符合搜索条件的酒店如下:");
        cusChoice1(customerName,customerRoomType);
        System.out.println("\t");
        //选择酒店(精准搜索)
        String customerName1 = "格雅苏州工业园区金鸡湖东方之门酒店";
        String customerRoomType1 = "豪华双床房";
        boolean memberCustomer = true;      //是否是会员验证
       //输出订单信息
        for(int j = 0;j<name.length;j++) {   
        	if((customerName1.equals(name[j]))&&(customerRoomType1.equals(roomType[j]))){
        		
        		System.out.println("订单信息:");
        		
        		//订单编号生成
        		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        		int r1=(int)(Math.random()*(10));//产生2个0-9的随机数
      	        int r2=(int)(Math.random()*(10));
      	        String paymentID0 =String.valueOf(r1)+String.valueOf(r2)+df.format(new Date());
    	        int r3=(int)(Math.random()*(10));//产生2个0-9的随机数
    	        int r4=(int)(Math.random()*(10));
    	        String paymentID = paymentID0 +String.valueOf(r4)+String.valueOf(r3);
                System.out.print("订单编号"+paymentID+"    ");
        		//酒店基本信息显示
        		System.out.print("酒店:"+customerName1+"     ");
        		System.out.print("房间类型:"+customerRoomType1+"     ");
        		cusChoice2(customerRoomType, memberCustomer,j);
        		System.out.println("祝您入住愉快。 Welcome to our hotel,the new couple! Wish you have a pleasant time here!");
        		//生成订单时间显示
        		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        		System.out.println(df1.format(new Date()));
        	}
        	 
        }
	}
	
	
	
	public static void cusChoice1(String customerName,String customerRoomType) {
		
		String[] name= {"格林豪泰苏州火车站南广场拙政园商务酒店","格林豪泰苏州火车站南广场拙政园商务酒店","格林豪泰苏州火车站南广场拙政园商务酒店",
				"格雅苏州工业园区金鸡湖东方之门酒店","格林豪泰苏州漕湖工业园智选酒店"};
		String[] roomType = {"大床房","标间","豪华双床房","豪华双床房","高级大床房"};
			for(int i=0;i<name.length;i++) {
				if(Pattern.matches(customerName,name[i])) {
						if(Pattern.matches(customerRoomType,roomType[i])) {
							System.out.print(name[i]+"        ");
							System.out.println(roomType[i]);
							
					    }
			    }
				
			}
	}
	
	
	public static void cusChoice2(String customerRoomType,boolean memberCustomer,int j) {
		
		String[] adress = {"江苏省苏州市姑苏区人民路2156号","江苏省苏州市姑苏区人民路2156号","江苏省苏州市姑苏区人民路2156号",
						   "江苏省苏州工业园区星海街169号","江苏省苏州市相城区黄畦路3号"};
		int[] price = {189,169,209,399,189};
		int[] memberPrice = {161,149,190,339,161};
		int[] voucher = {20,10,30,20,10};
			    if(memberCustomer==false) {
			    	 
				     System.out.print("房间价格:"+price[j]+"    ");
				     System.out.print("代金券:"+voucher[j]+"    ");
				     System.out.print("支付价格:"+(price[j]-voucher[j])+"    ");
				     System.out.println("地址:"+adress[j]);
				     
			    }else{
			    	
					 System.out.print("优惠价格"+memberPrice[j]+"   ");
					 System.out.print("代金券:"+voucher[j]+"   ");
					 System.out.print("支付价格:"+(memberPrice[j]-voucher[j])+"    ");
					 System.out.println("地址:"+adress[j]);
			    }	
	}
}

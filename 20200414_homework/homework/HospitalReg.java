package com.Achter.homework;
/**
 * 
 * @author Achter
 * @date   2020年4月15日
 *
 */

public class HospitalReg {

	public static void main(String[] args) {
		int i = 1;
		/*String pat = "挂号";      //pat为患者
		if(pat == "挂号"){
		System.out.println("i=1");}*/
		 hospReg1(i);
		   i++;  
		}
	  
    public static void hospReg1(int i) {
		  //  if语句
			/*if(i==0){
				System.out.println("first");
			}else if(i==1){
				System.out.println("second");
			}else if(i==2){
				System.out.println("third");
	        }else{
	        	System.out.println("无效");
	        }*/
          
		// switch语句
			switch (i) {
			case 1:
			case 2:
			case 3:
				
				System.out.println("挂号成功");
			break;

			default:
				System.out.println("挂号失败");
		    }
         }
      }
 
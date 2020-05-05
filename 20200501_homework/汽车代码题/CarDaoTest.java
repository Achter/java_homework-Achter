package com.homework.test;

import com.achter.dao.CarDao;
import com.achter.homework.Car;

/**
 * 测试类
 * @author Achter
 * @date   2020年5月5日
 *
 */
public class CarDaoTest {

	public static void main(String[] args) {
		
		Car car = new Car("别克", "轿车", 180000, 6, 300, 55);//品牌,车型,价格,油耗,里程数,油箱容积
		CarDao c1 = new CarDaoImpl();
		System.out.println("品牌为"+car.getBrand()+"的"+car.getCarType()+"加满油的情况下行驶"+car.getKilometer()+"公里,剩余油量为:"+c1.getRemianOil(car)+"升");
	
	}

}

package com.homework.test;

import com.achter.dao.CarDao;
import com.achter.homework.Car;

/**
 * 接口实现类:车类
 * @author Achter
 * @date   2020年5月5日
 *
 */
public class CarDaoImpl implements CarDao {

	//重写方法
	@Override
	public int getRemianOil(Car car) {
		int remainOil = car.getFuelTankCapa();
		double kilomRe =(car.getKilometer()/100)*car.getFuel();
	    remainOil=(int)(remainOil- kilomRe);
		return remainOil;
	}

}

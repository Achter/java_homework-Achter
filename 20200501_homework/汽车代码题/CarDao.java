package com.achter.dao;

import com.achter.homework.Car;

/**
 * 车类的接口
 * @author achter
 * @date   2020年5月5日
 *
 */
public abstract interface CarDao {
	//获得剩余油量
	int getRemianOil(Car car);
}

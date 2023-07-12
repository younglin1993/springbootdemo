package com.younglin.springbootdemo.service;

import java.util.List;
import com.younglin.springbootdemo.entity.Booking;
import com.younglin.springbootdemo.service.exception.BookingNotFoundException;

public interface BookingService {
	
	List<Booking> findAll();
	List<Booking> findByMemberBeanMemno(int memno);
	List<Booking> findByGameBeanGameid(int gameID);
	void insert(Booking booking);
	void deleteById(int bookingID);
	void update(Booking booking);
}

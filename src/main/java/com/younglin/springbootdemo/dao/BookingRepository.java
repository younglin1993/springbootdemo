package com.younglin.springbootdemo.dao;

import com.younglin.springbootdemo.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    List<Booking> findByMemberBeanMemno(int memno);
    List<Booking> findByGameBeanGameid(int gameid);

}

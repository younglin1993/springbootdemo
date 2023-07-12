package com.younglin.springbootdemo.service;

import com.younglin.springbootdemo.entity.Booking;
import com.younglin.springbootdemo.entity.GameBean;

import java.util.List;

public interface GameService {

    List<GameBean> findAll();

    GameBean findById(int gameID);
    void insert(GameBean game);
    void deleteById(int gameID);
    void update(GameBean game);

    GameBean findByGname(String gname);
}

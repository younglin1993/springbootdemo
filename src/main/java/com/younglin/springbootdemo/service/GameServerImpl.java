package com.younglin.springbootdemo.service;

import com.younglin.springbootdemo.dao.GameRepository;
import com.younglin.springbootdemo.entity.GameBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GameServerImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public List<GameBean> findAll() {
        return gameRepository.findAll();
    }

    @Override
    public GameBean findById(int gameID) {
        return gameRepository.findById(gameID).orElse(null);
    }

    @Override
    public void insert(GameBean game) {
        gameRepository.save(game);
    }

    @Override
    public void deleteById(int gameID) {
        gameRepository.deleteById(gameID);
    }

    @Override
    public void update(GameBean game) {
        gameRepository.save(game);
    }

    @Override
    public GameBean findByGname(String gname) {
        return gameRepository.findByGname(gname);
    }


}

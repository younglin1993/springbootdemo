package com.younglin.springbootdemo.dao;

import com.younglin.springbootdemo.entity.GameBean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GameRepository extends JpaRepository<GameBean, Integer> {

    GameBean findByGname(String Gname);
}

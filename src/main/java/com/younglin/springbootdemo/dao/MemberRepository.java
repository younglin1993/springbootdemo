package com.younglin.springbootdemo.dao;

import com.younglin.springbootdemo.entity.MemberBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberBean, Integer> {

    MemberBean findByEmail(String email);
}

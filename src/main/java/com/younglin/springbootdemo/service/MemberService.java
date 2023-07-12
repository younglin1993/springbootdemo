package com.younglin.springbootdemo.service;

import com.younglin.springbootdemo.entity.MemberBean;

import java.util.List;

public interface MemberService {

    List<MemberBean> findAll();
    void insert(MemberBean member);
    void deleteById(int memno);
    void update(MemberBean member);
    MemberBean findByEmail(String email);
}

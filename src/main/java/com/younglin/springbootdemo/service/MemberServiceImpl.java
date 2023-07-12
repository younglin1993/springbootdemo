package com.younglin.springbootdemo.service;

import com.younglin.springbootdemo.dao.MemberRepository;
import com.younglin.springbootdemo.entity.MemberBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<MemberBean> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public void insert(MemberBean member) {
        memberRepository.save(member);
    }

    @Override
    public void deleteById(int memno) {
        memberRepository.deleteById(memno);
    }

    @Override
    public void update(MemberBean member) {
        memberRepository.save(member);
    }

    @Override
    public MemberBean findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }
}

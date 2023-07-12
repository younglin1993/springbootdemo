package com.younglin.springbootdemo.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity @Table(name = "member")
@Component
public class MemberBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="memno")
    private int memno;
    private String email;
    private String memclass;
    private String memstatus;
    private String password;
    private String memname;
    private String memid;
    private String birthdate;
    private String phone;
    private String memaddress;
    private String memimg;


    public MemberBean() {
    }
    public MemberBean(String email, String memclass, String memstatus, String password, String memname, String memid,
                      String birthdate, String phone, String memaddress, String memimg) {
        this.email = email;
        this.memclass = memclass;
        this.memstatus = memstatus;
        this.password = password;
        this.memname = memname;
        this.memid = memid;
        this.birthdate = birthdate;
        this.phone = phone;
        this.memaddress = memaddress;
        this.memimg = memimg;
    }
    public String getMemstatus() {
        return memstatus;
    }
    public void setMemstatus(String memstatus) {
        this.memstatus = memstatus;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getMemno() {
        return memno;
    }
    public void setMemno(int memno) {
        this.memno = memno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMemclass() {
        return memclass;
    }
    public void setMemclass(String memclass) {
        this.memclass = memclass;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMemname() {
        return memname;
    }
    public void setMemname(String name) {
        this.memname = name;
    }
    public String getMemid() {
        return memid;
    }
    public void setMemid(String id) {
        this.memid = id;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    public String getMemaddress() {
        return memaddress;
    }
    public void setMemaddress(String address) {
        this.memaddress = address;
    }
    public String getMemimg() {
        return memimg;
    }
    public void setMemimg(String img) {
        this.memimg = img;
    }

    @Override
    public String toString() {
        return "MemberBean{" +
                "memno=" + memno +
                ", email='" + email + '\'' +
                ", memclass='" + memclass + '\'' +
                ", memstatus='" + memstatus + '\'' +
                ", password='" + password + '\'' +
                ", memname='" + memname + '\'' +
                ", memid='" + memid + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", phone='" + phone + '\'' +
                ", memaddress='" + memaddress + '\'' +
                ", memimg='" + memimg + '\'' +
                '}';
    }
}

package com.younglin.springbootdemo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name="GAMEDATA")
@Component
public class GameBean implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

//	gameid	studio	gname	level	player	time	address	phone	priceper	desc	gameimg

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameid;
    private String studio;
    private String gname;
    private String level;
    private String player;
    private String time;
    private String address;
    private String phone;
    private String priceper;
    @Column(name ="textdesc")
    private String desc;
    private String gameimg;

    // =========================================


    public GameBean() {
    }



    public GameBean(String studio, String gname, String level, String player, String time, String address,
                    String phone, String priceper, String desc, String gameimg) {
        this.studio = studio;
        this.gname = gname;
        this.level = level;
        this.player = player;
        this.time = time;
        this.address = address;
        this.phone = phone;
        this.priceper = priceper;
        this.desc = desc;
        this.gameimg = gameimg;
    }

    // =========================================

    public int getGameId() { return gameid; }
    public String getStudio() {  return studio;  }
    public String getGname() { return gname; }
    public String getLevel() { return level; }
    public String getPlayer() {  return player;  }
    public String getTime() {  return time;  }
    public String getAddress() {  return address;  }
    public String getPhone() {  return phone;  }
    public String getPriceper() { return priceper; }
    public String getDesc() {  return desc;  }
    public String getGameimg() { return gameimg; }


    public void setGameId(int gameid) { this.gameid = gameid; }
    public void setStudio(String studio) {  this.studio = studio;  }
    public void setGname(String gname) { this.gname = gname; }
    public void setLevel(String level) { this.level = level; }
    public void setPlayer(String player) {  this.player = player;  }
    public void setTime(String time) {  this.time= time;	}
    public void setAddress(String address) {  this.address= address;	}
    public void setPhone(String phone) {  this.phone= phone;	}
    public void setPriceper(String priceper) { this.priceper = priceper; }
    public void setDesc(String desc) {  this.desc= desc;	}
    public void setGameimg(String gameimg) { this.gameimg = gameimg; }

    @Override
    public String toString() {
        return "GameBean{" +
                "gameid=" + gameid +
                ", studio='" + studio + '\'' +
                ", gname='" + gname + '\'' +
                ", level='" + level + '\'' +
                ", player='" + player + '\'' +
                ", time='" + time + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", priceper='" + priceper + '\'' +
                ", desc='" + desc + '\'' +
                ", gameimg='" + gameimg + '\'' +
                '}';
    }
}
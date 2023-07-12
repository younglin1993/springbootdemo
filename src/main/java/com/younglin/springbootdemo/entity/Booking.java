package com.younglin.springbootdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingid")
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "userid")
    private MemberBean memberBean;

    @ManyToOne
    @JoinColumn(name = "gameid")
    private GameBean gameBean;

    @Column(name = "bookingdate")
    private String bookingDate;

    @Column(name = "bookingtime")
    private String bookingTime;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public MemberBean getMemberBean() {
        return memberBean;
    }

    public void setMemberBean(MemberBean memberBean) {
        this.memberBean = memberBean;
    }

    public GameBean getGameBean() {
        return gameBean;
    }

    public void setGameBean(GameBean gameBean) {
        this.gameBean = gameBean;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String reservationDate) {
        this.bookingDate = reservationDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String reservationTime) {
        this.bookingTime = reservationTime;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", memberBean=" + memberBean +
                ", gameBean=" + gameBean +
                ", bookingDate='" + bookingDate + '\'' +
                ", bookingTime='" + bookingTime + '\'' +
                '}';
    }
}

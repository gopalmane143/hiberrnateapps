package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="busTab")
public class BusTicket {
	@Id
	@Column(name="tid")
	private int tcId;
	@Column(name="source")
	private String from;
	@Column(name="destination")
	private String to;
	@Column(name="total")
	private double fare;
	@Transient
	private String discCupon;
	@Column(name="discount")
	private double discAmt;
	public BusTicket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTcId() {
		return tcId;
	}
	public void setTcId(int tcId) {
		this.tcId = tcId;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getDiscCupon() {
		return discCupon;
	}
	public void setDiscCupon(String discCupon) {
		this.discCupon = discCupon;
	}
	public double getDiscAmt() {
		return discAmt;
	}
	public void setDiscAmt(double discAmt) {
		this.discAmt = discAmt;
	}
	@Override
	public String toString() {
		return "BusTicket [tcId=" + tcId + ", from=" + from + ", to=" + to + ", fare=" + fare + ", discCupon="
				+ discCupon + ", discAmt=" + discAmt + "]";
	}


}

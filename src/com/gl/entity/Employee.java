package com.gl.entity;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class Employee {

	@Id
	private int eno;
	@Column(length=20)
	private String ename;
	private double sal;
	
	private Address permAddress;
	

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eno, String ename, double sal, Address permAddress) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.permAddress = permAddress;
	}

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

	public Address getPermAddress() {
		return permAddress;
	}

	public void setPermAddress(Address permAddress) {
		this.permAddress = permAddress;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", permAddress=" + permAddress + "]";
	}
	
	
	
	
	
}

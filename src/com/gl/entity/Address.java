package com.gl.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
		private int houseNo;
		private String stateName;
		private String cityName;
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Address(int houseNo, String stateName, String cityName) {
			super();
			this.houseNo = houseNo;
			this.stateName = stateName;
			this.cityName = cityName;
		}
		public int getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(int houseNo) {
			this.houseNo = houseNo;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		@Override
		public String toString() {
			return "Address [houseNo=" + houseNo + ", stateName=" + stateName + ", cityName=" + cityName + "]";
		}
		
		
}

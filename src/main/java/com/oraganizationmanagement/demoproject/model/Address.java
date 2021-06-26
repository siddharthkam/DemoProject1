package com.oraganizationmanagement.demoproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ADDRESS_STUDENT")
public class Address {
	
	private String roomNo;
	@Id
	@GeneratedValue(generator = "ADDRESS_SEQ",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "ADDRESS_SEQ_ID_S",initialValue = 1,allocationSize = 1,name = "ADDRESS_SEQ")
	private int addressId;
	private String city;
	private String state;
	private int pinocde;
	
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinocde() {
		return pinocde;
	}
	public void setPinocde(int pinocde) {
		this.pinocde = pinocde;
	}
	@Override
	public String toString() {
		return "Address [roomNo=" + roomNo + ", addressId=" + addressId + ", city=" + city + ", state=" + state
				+ ", pinocde=" + pinocde + "]";
	}

}

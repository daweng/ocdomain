package com.advent.oc.domain.core;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Address extends  BaseEntity 
{
	protected String street;
	protected String stateProvince;
	protected String postalCode;
	protected UUID countryId;
	protected AddressType type;
	protected AddressType addressType;
	
	public Address(){
		super();
	}
	
	public Address(UUID id, String extId, Short sourceId , String street, String stateProvince, String postalCode, UUID countryId, AddressType type, AddressType addressType
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.street = street;
        this.stateProvince = stateProvince;
        this.postalCode = postalCode;
        this.countryId = countryId;
        this.type = type;
        this.addressType = addressType;
    	
    }
    
	
	public String getStreet() {
	    return this.street;
	}
	
	public void setStreet(String street) {
	    this.street = street;
	}
	
	
	public String getStateProvince() {
	    return this.stateProvince;
	}
	
	public void setStateProvince(String stateProvince) {
	    this.stateProvince = stateProvince;
	}
	
	
	public String getPostalCode() {
	    return this.postalCode;
	}
	
	public void setPostalCode(String postalCode) {
	    this.postalCode = postalCode;
	}
	
	
	public UUID getCountryId() {
	    return this.countryId;
	}
	
	public void setCountryId(UUID countryId) {
	    this.countryId = countryId;
	}
	
	
	public AddressType getType() {
	    return this.type;
	}
	
	public void setType(AddressType type) {
	    this.type = type;
	}
	
	
	public AddressType getAddressType() {
	    return this.addressType;
	}
	
	public void setAddressType(AddressType addressType) {
	    this.addressType = addressType;
	}
	
	
	@Override
    public String toString() {
        return "Address{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", street='" + street + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", countryId='" + countryId + '\'' +
                ", type='" + type + '\'' +
                ", addressType='" + addressType + '\'' +
                
                
                '}';
    }
    
}

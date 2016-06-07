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

public class Currency extends  BaseEntity 
{
	protected String isoCode;
	protected String name;
	protected int decimalPlaces;
	protected String symbol;
	
	public Currency(){
		super();
	}
	
	public Currency(UUID id, String extId, Short sourceId , String isoCode, String name, int decimalPlaces, String symbol
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.isoCode = isoCode;
        this.name = name;
        this.decimalPlaces = decimalPlaces;
        this.symbol = symbol;
    	
    }
    
	
	public String getIsoCode() {
	    return this.isoCode;
	}
	
	public void setIsoCode(String isoCode) {
	    this.isoCode = isoCode;
	}
	
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public int getDecimalPlaces() {
	    return this.decimalPlaces;
	}
	
	public void setDecimalPlaces(int decimalPlaces) {
	    this.decimalPlaces = decimalPlaces;
	}
	
	
	public String getSymbol() {
	    return this.symbol;
	}
	
	public void setSymbol(String symbol) {
	    this.symbol = symbol;
	}
	
	
	@Override
    public String toString() {
        return "Currency{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", isoCode='" + isoCode + '\'' +
                ", name='" + name + '\'' +
                ", decimalPlaces='" + decimalPlaces + '\'' +
                ", symbol='" + symbol + '\'' +
                
                
                '}';
    }
    
}

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

public class ExchangeRate extends  BaseEntity 
{
	protected UUID toCurrencyId;
	protected LocalDateTime asOf;
	protected BigDecimal rate;
	protected UUID currencyId;
	
	public ExchangeRate(){
		super();
	}
	
	public ExchangeRate(UUID id, String extId, Short sourceId , UUID toCurrencyId, LocalDateTime asOf, BigDecimal rate
	, UUID currencyId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.toCurrencyId = toCurrencyId;
        this.asOf = asOf;
        this.rate = rate;
        this.currencyId = currencyId;
    	
    }
    
	
	public UUID getToCurrencyId() {
	    return this.toCurrencyId;
	}
	
	public void setToCurrencyId(UUID toCurrencyId) {
	    this.toCurrencyId = toCurrencyId;
	}
	
	
	public LocalDateTime getAsOf() {
	    return this.asOf;
	}
	
	public void setAsOf(LocalDateTime asOf) {
	    this.asOf = asOf;
	}
	
	
	public BigDecimal getRate() {
	    return this.rate;
	}
	
	public void setRate(BigDecimal rate) {
	    this.rate = rate;
	}
	
	
	public UUID getCurrencyId() {
	    return this.currencyId;
	}
	
	public void setCurrencyId(UUID currencyId) {
	    this.currencyId = currencyId;
	}
	
	
	@Override
    public String toString() {
        return "ExchangeRate{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", toCurrencyId='" + toCurrencyId + '\'' +
                ", asOf='" + asOf + '\'' +
                ", rate='" + rate + '\'' +
                ", currencyId='" + currencyId + '\'' +
                
                
                '}';
    }
    
}

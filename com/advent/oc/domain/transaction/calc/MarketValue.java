package com.advent.oc.domain.transaction.calc;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MarketValue extends  BaseEntity 
{
	protected LocalDate asOf;
	protected BigDecimal amount;
	
	public MarketValue(){
		super();
	}
	
	public MarketValue(UUID id, String extId, Short sourceId , LocalDate asOf, BigDecimal amount
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.asOf = asOf;
        this.amount = amount;
    	
    }
    
	
	public LocalDate getAsOf() {
	    return this.asOf;
	}
	
	public void setAsOf(LocalDate asOf) {
	    this.asOf = asOf;
	}
	
	
	public BigDecimal getAmount() {
	    return this.amount;
	}
	
	public void setAmount(BigDecimal amount) {
	    this.amount = amount;
	}
	
	
	@Override
    public String toString() {
        return "MarketValue{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", asOf='" + asOf + '\'' +
                ", amount='" + amount + '\'' +
                
                
                '}';
    }
    
}

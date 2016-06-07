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

public class TimeWeightedReturn extends  BaseEntity 
{
	protected LocalDate from;
	protected LocalDate to;
	protected BigDecimal rate;
	
	public TimeWeightedReturn(){
		super();
	}
	
	public TimeWeightedReturn(UUID id, String extId, Short sourceId , LocalDate from, LocalDate to, BigDecimal rate
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.from = from;
        this.to = to;
        this.rate = rate;
    	
    }
    
	
	public LocalDate getFrom() {
	    return this.from;
	}
	
	public void setFrom(LocalDate from) {
	    this.from = from;
	}
	
	
	public LocalDate getTo() {
	    return this.to;
	}
	
	public void setTo(LocalDate to) {
	    this.to = to;
	}
	
	
	public BigDecimal getRate() {
	    return this.rate;
	}
	
	public void setRate(BigDecimal rate) {
	    this.rate = rate;
	}
	
	
	@Override
    public String toString() {
        return "TimeWeightedReturn{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", rate='" + rate + '\'' +
                
                
                '}';
    }
    
}

package com.advent.oc.domain.account;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GainWithholdingMatrix extends  BaseEntity 
{
	protected UUID countryId;
	protected Date startDate;
	protected BigDecimal shortTermRate;
	protected BigDecimal longTermRate;
	
	public GainWithholdingMatrix(){
		super();
	}
	
	public GainWithholdingMatrix(UUID id, String extId, Short sourceId , UUID countryId, Date startDate, BigDecimal shortTermRate, BigDecimal longTermRate
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.countryId = countryId;
        this.startDate = startDate;
        this.shortTermRate = shortTermRate;
        this.longTermRate = longTermRate;
    	
    }
    
	
	public UUID getCountryId() {
	    return this.countryId;
	}
	
	public void setCountryId(UUID countryId) {
	    this.countryId = countryId;
	}
	
	
	public Date getStartDate() {
	    return this.startDate;
	}
	
	public void setStartDate(Date startDate) {
	    this.startDate = startDate;
	}
	
	
	public BigDecimal getShortTermRate() {
	    return this.shortTermRate;
	}
	
	public void setShortTermRate(BigDecimal shortTermRate) {
	    this.shortTermRate = shortTermRate;
	}
	
	
	public BigDecimal getLongTermRate() {
	    return this.longTermRate;
	}
	
	public void setLongTermRate(BigDecimal longTermRate) {
	    this.longTermRate = longTermRate;
	}
	
	
	@Override
    public String toString() {
        return "GainWithholdingMatrix{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", countryId='" + countryId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", shortTermRate='" + shortTermRate + '\'' +
                ", longTermRate='" + longTermRate + '\'' +
                
                
                '}';
    }
    
}

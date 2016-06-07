package com.advent.oc.domain.security;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class VariableRateSchedule extends  BaseEntity 
{
	protected UUID referenceIndexId;
	protected BigDecimal spread;
	protected BigDecimal cap;
	protected BigDecimal floor;
	protected RateResetFrequency rateResetFrequency;
	protected BigDecimal multiplier;
	protected UUID benchmarkIndexId;
	protected UUID debtId;
	
	public VariableRateSchedule(){
		super();
	}
	
	public VariableRateSchedule(UUID id, String extId, Short sourceId , UUID referenceIndexId, BigDecimal spread, BigDecimal cap, BigDecimal floor, RateResetFrequency rateResetFrequency, BigDecimal multiplier
	, UUID benchmarkIndexId, UUID debtId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.referenceIndexId = referenceIndexId;
        this.spread = spread;
        this.cap = cap;
        this.floor = floor;
        this.rateResetFrequency = rateResetFrequency;
        this.multiplier = multiplier;
        this.benchmarkIndexId = benchmarkIndexId;
        this.debtId = debtId;
    	
    }
    
	
	public UUID getReferenceIndexId() {
	    return this.referenceIndexId;
	}
	
	public void setReferenceIndexId(UUID referenceIndexId) {
	    this.referenceIndexId = referenceIndexId;
	}
	
	
	public BigDecimal getSpread() {
	    return this.spread;
	}
	
	public void setSpread(BigDecimal spread) {
	    this.spread = spread;
	}
	
	
	public BigDecimal getCap() {
	    return this.cap;
	}
	
	public void setCap(BigDecimal cap) {
	    this.cap = cap;
	}
	
	
	public BigDecimal getFloor() {
	    return this.floor;
	}
	
	public void setFloor(BigDecimal floor) {
	    this.floor = floor;
	}
	
	
	public RateResetFrequency getRateResetFrequency() {
	    return this.rateResetFrequency;
	}
	
	public void setRateResetFrequency(RateResetFrequency rateResetFrequency) {
	    this.rateResetFrequency = rateResetFrequency;
	}
	
	
	public BigDecimal getMultiplier() {
	    return this.multiplier;
	}
	
	public void setMultiplier(BigDecimal multiplier) {
	    this.multiplier = multiplier;
	}
	
	
	public UUID getBenchmarkIndexId() {
	    return this.benchmarkIndexId;
	}
	
	public void setBenchmarkIndexId(UUID benchmarkIndexId) {
	    this.benchmarkIndexId = benchmarkIndexId;
	}
	
	
	public UUID getDebtId() {
	    return this.debtId;
	}
	
	public void setDebtId(UUID debtId) {
	    this.debtId = debtId;
	}
	
	
	@Override
    public String toString() {
        return "VariableRateSchedule{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", referenceIndexId='" + referenceIndexId + '\'' +
                ", spread='" + spread + '\'' +
                ", cap='" + cap + '\'' +
                ", floor='" + floor + '\'' +
                ", rateResetFrequency='" + rateResetFrequency + '\'' +
                ", multiplier='" + multiplier + '\'' +
                ", benchmarkIndexId='" + benchmarkIndexId + '\'' +
                ", debtId='" + debtId + '\'' +
                
                
                '}';
    }
    
}

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

public class SecurityType extends  BaseEntity 
{
	protected String name;
	protected BigDecimal pricingFactor;
	protected int tradingFactor;
	protected int quantityPrecision;
	protected int settlementDays;
	
	public SecurityType(){
		super();
	}
	
	public SecurityType(UUID id, String extId, Short sourceId , String name, BigDecimal pricingFactor, int tradingFactor, int quantityPrecision, int settlementDays
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.pricingFactor = pricingFactor;
        this.tradingFactor = tradingFactor;
        this.quantityPrecision = quantityPrecision;
        this.settlementDays = settlementDays;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public BigDecimal getPricingFactor() {
	    return this.pricingFactor;
	}
	
	public void setPricingFactor(BigDecimal pricingFactor) {
	    this.pricingFactor = pricingFactor;
	}
	
	
	public int getTradingFactor() {
	    return this.tradingFactor;
	}
	
	public void setTradingFactor(int tradingFactor) {
	    this.tradingFactor = tradingFactor;
	}
	
	
	public int getQuantityPrecision() {
	    return this.quantityPrecision;
	}
	
	public void setQuantityPrecision(int quantityPrecision) {
	    this.quantityPrecision = quantityPrecision;
	}
	
	
	public int getSettlementDays() {
	    return this.settlementDays;
	}
	
	public void setSettlementDays(int settlementDays) {
	    this.settlementDays = settlementDays;
	}
	
	
	@Override
    public String toString() {
        return "SecurityType{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", pricingFactor='" + pricingFactor + '\'' +
                ", tradingFactor='" + tradingFactor + '\'' +
                ", quantityPrecision='" + quantityPrecision + '\'' +
                ", settlementDays='" + settlementDays + '\'' +
                
                
                '}';
    }
    
}

package com.advent.oc.domain.marketdata;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Price extends  BaseEntity 
{
	protected LocalDateTime asOf;
	protected UUID priceDenominationId;
	protected BigDecimal value;
	protected PriceType type;
	protected PriceQuality quality;
	protected UUID securityId;
	
	public Price(){
		super();
	}
	
	public Price(UUID id, String extId, Short sourceId , LocalDateTime asOf, UUID priceDenominationId, BigDecimal value, PriceType type, PriceQuality quality
	, UUID securityId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.asOf = asOf;
        this.priceDenominationId = priceDenominationId;
        this.value = value;
        this.type = type;
        this.quality = quality;
        this.securityId = securityId;
    	
    }
    
	
	public LocalDateTime getAsOf() {
	    return this.asOf;
	}
	
	public void setAsOf(LocalDateTime asOf) {
	    this.asOf = asOf;
	}
	
	
	public UUID getPriceDenominationId() {
	    return this.priceDenominationId;
	}
	
	public void setPriceDenominationId(UUID priceDenominationId) {
	    this.priceDenominationId = priceDenominationId;
	}
	
	
	public BigDecimal getValue() {
	    return this.value;
	}
	
	public void setValue(BigDecimal value) {
	    this.value = value;
	}
	
	
	public PriceType getType() {
	    return this.type;
	}
	
	public void setType(PriceType type) {
	    this.type = type;
	}
	
	
	public PriceQuality getQuality() {
	    return this.quality;
	}
	
	public void setQuality(PriceQuality quality) {
	    this.quality = quality;
	}
	
	
	public UUID getSecurityId() {
	    return this.securityId;
	}
	
	public void setSecurityId(UUID securityId) {
	    this.securityId = securityId;
	}
	
	
	@Override
    public String toString() {
        return "Price{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", asOf='" + asOf + '\'' +
                ", priceDenominationId='" + priceDenominationId + '\'' +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                ", quality='" + quality + '\'' +
                ", securityId='" + securityId + '\'' +
                
                
                '}';
    }
    
}

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

public class Country extends  BaseEntity 
{
	protected String name;
	protected String isoCode2;
	protected String isoCode3;
	protected String region;
	protected UUID economicCurrencyId;
	
	public Country(){
		super();
	}
	
	public Country(UUID id, String extId, Short sourceId , String name, String isoCode2, String isoCode3, String region, UUID economicCurrencyId
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.isoCode2 = isoCode2;
        this.isoCode3 = isoCode3;
        this.region = region;
        this.economicCurrencyId = economicCurrencyId;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public String getIsoCode2() {
	    return this.isoCode2;
	}
	
	public void setIsoCode2(String isoCode2) {
	    this.isoCode2 = isoCode2;
	}
	
	
	public String getIsoCode3() {
	    return this.isoCode3;
	}
	
	public void setIsoCode3(String isoCode3) {
	    this.isoCode3 = isoCode3;
	}
	
	
	public String getRegion() {
	    return this.region;
	}
	
	public void setRegion(String region) {
	    this.region = region;
	}
	
	
	public UUID getEconomicCurrencyId() {
	    return this.economicCurrencyId;
	}
	
	public void setEconomicCurrencyId(UUID economicCurrencyId) {
	    this.economicCurrencyId = economicCurrencyId;
	}
	
	
	@Override
    public String toString() {
        return "Country{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", isoCode2='" + isoCode2 + '\'' +
                ", isoCode3='" + isoCode3 + '\'' +
                ", region='" + region + '\'' +
                ", economicCurrencyId='" + economicCurrencyId + '\'' +
                
                
                '}';
    }
    
}

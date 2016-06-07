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

public class FirmwideSettings extends  BaseEntity 
{
	protected UUID globalCurrencyId;
	
	public FirmwideSettings(){
		super();
	}
	
	public FirmwideSettings(UUID id, String extId, Short sourceId , UUID globalCurrencyId
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.globalCurrencyId = globalCurrencyId;
    	
    }
    
	
	public UUID getGlobalCurrencyId() {
	    return this.globalCurrencyId;
	}
	
	public void setGlobalCurrencyId(UUID globalCurrencyId) {
	    this.globalCurrencyId = globalCurrencyId;
	}
	
	
	@Override
    public String toString() {
        return "FirmwideSettings{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", globalCurrencyId='" + globalCurrencyId + '\'' +
                
                
                '}';
    }
    
}

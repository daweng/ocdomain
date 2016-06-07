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

public class TradingCalendar extends  BaseEntity 
{
	protected UUID exchangeId;
	
	public TradingCalendar(){
		super();
	}
	
	public TradingCalendar(UUID id, String extId, Short sourceId 
	, UUID exchangeId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.exchangeId = exchangeId;
    	
    }
    
	
	public UUID getExchangeId() {
	    return this.exchangeId;
	}
	
	public void setExchangeId(UUID exchangeId) {
	    this.exchangeId = exchangeId;
	}
	
	
	@Override
    public String toString() {
        return "TradingCalendar{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", exchangeId='" + exchangeId + '\'' +
                
                
                '}';
    }
    
}

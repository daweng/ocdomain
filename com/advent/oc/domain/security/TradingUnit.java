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

public class TradingUnit extends  BaseEntity 
{
	protected int tradingUnit;
	
	public TradingUnit(){
		super();
	}
	
	public TradingUnit(UUID id, String extId, Short sourceId , int tradingUnit
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.tradingUnit = tradingUnit;
    	
    }
    
	
	public int getTradingUnit() {
	    return this.tradingUnit;
	}
	
	public void setTradingUnit(int tradingUnit) {
	    this.tradingUnit = tradingUnit;
	}
	
	
	@Override
    public String toString() {
        return "TradingUnit{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", tradingUnit='" + tradingUnit + '\'' +
                
                
                '}';
    }
    
}

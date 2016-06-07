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

public class Exchange extends  BaseEntity 
{
	protected String name;
	protected Calendar holidayCalendar;
	protected UUID countryId;
	protected String mic;
	protected String marketIdentifierCode;
	protected UUID securityTypeId;
	protected UUID tradingCalendarId;
	
	public Exchange(){
		super();
	}
	
	public Exchange(UUID id, String extId, Short sourceId , String name, Calendar holidayCalendar, UUID countryId, String mic, String marketIdentifierCode
	, UUID securityTypeId, UUID tradingCalendarId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.holidayCalendar = holidayCalendar;
        this.countryId = countryId;
        this.mic = mic;
        this.marketIdentifierCode = marketIdentifierCode;
        this.securityTypeId = securityTypeId;
        this.tradingCalendarId = tradingCalendarId;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public Calendar getHolidayCalendar() {
	    return this.holidayCalendar;
	}
	
	public void setHolidayCalendar(Calendar holidayCalendar) {
	    this.holidayCalendar = holidayCalendar;
	}
	
	
	public UUID getCountryId() {
	    return this.countryId;
	}
	
	public void setCountryId(UUID countryId) {
	    this.countryId = countryId;
	}
	
	
	public String getMic() {
	    return this.mic;
	}
	
	public void setMic(String mic) {
	    this.mic = mic;
	}
	
	
	public String getMarketIdentifierCode() {
	    return this.marketIdentifierCode;
	}
	
	public void setMarketIdentifierCode(String marketIdentifierCode) {
	    this.marketIdentifierCode = marketIdentifierCode;
	}
	
	
	public UUID getSecurityTypeId() {
	    return this.securityTypeId;
	}
	
	public void setSecurityTypeId(UUID securityTypeId) {
	    this.securityTypeId = securityTypeId;
	}
	
	
	public UUID getTradingCalendarId() {
	    return this.tradingCalendarId;
	}
	
	public void setTradingCalendarId(UUID tradingCalendarId) {
	    this.tradingCalendarId = tradingCalendarId;
	}
	
	
	@Override
    public String toString() {
        return "Exchange{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", holidayCalendar='" + holidayCalendar + '\'' +
                ", countryId='" + countryId + '\'' +
                ", mic='" + mic + '\'' +
                ", marketIdentifierCode='" + marketIdentifierCode + '\'' +
                ", securityTypeId='" + securityTypeId + '\'' +
                ", tradingCalendarId='" + tradingCalendarId + '\'' +
                
                
                '}';
    }
    
}

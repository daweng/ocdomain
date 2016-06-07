package com.advent.oc.domain.model;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class HighLowWarnAlertTolerance extends  BaseEntity 
{
	protected BigDecimal lowAlert;
	protected BigDecimal highAlert;
	protected BigDecimal lowWarn;
	protected BigDecimal highWarn;
	
	public HighLowWarnAlertTolerance(){
		super();
	}
	
	public HighLowWarnAlertTolerance(UUID id, String extId, Short sourceId , BigDecimal lowAlert, BigDecimal highAlert, BigDecimal lowWarn, BigDecimal highWarn
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.lowAlert = lowAlert;
        this.highAlert = highAlert;
        this.lowWarn = lowWarn;
        this.highWarn = highWarn;
    	
    }
    
	
	public BigDecimal getLowAlert() {
	    return this.lowAlert;
	}
	
	public void setLowAlert(BigDecimal lowAlert) {
	    this.lowAlert = lowAlert;
	}
	
	
	public BigDecimal getHighAlert() {
	    return this.highAlert;
	}
	
	public void setHighAlert(BigDecimal highAlert) {
	    this.highAlert = highAlert;
	}
	
	
	public BigDecimal getLowWarn() {
	    return this.lowWarn;
	}
	
	public void setLowWarn(BigDecimal lowWarn) {
	    this.lowWarn = lowWarn;
	}
	
	
	public BigDecimal getHighWarn() {
	    return this.highWarn;
	}
	
	public void setHighWarn(BigDecimal highWarn) {
	    this.highWarn = highWarn;
	}
	
	
	@Override
    public String toString() {
        return "HighLowWarnAlertTolerance{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", lowAlert='" + lowAlert + '\'' +
                ", highAlert='" + highAlert + '\'' +
                ", lowWarn='" + lowWarn + '\'' +
                ", highWarn='" + highWarn + '\'' +
                
                
                '}';
    }
    
}

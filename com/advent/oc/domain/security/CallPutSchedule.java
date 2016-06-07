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

public class CallPutSchedule extends  BaseEntity 
{
	protected UUID debtId;
	
	public CallPutSchedule(){
		super();
	}
	
	public CallPutSchedule(UUID id, String extId, Short sourceId 
	, UUID debtId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.debtId = debtId;
    	
    }
    
	
	public UUID getDebtId() {
	    return this.debtId;
	}
	
	public void setDebtId(UUID debtId) {
	    this.debtId = debtId;
	}
	
	
	@Override
    public String toString() {
        return "CallPutSchedule{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", debtId='" + debtId + '\'' +
                
                
                '}';
    }
    
}

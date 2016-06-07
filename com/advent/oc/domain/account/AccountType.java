package com.advent.oc.domain.account;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccountType extends  BaseEntity 
{
	
	public AccountType(){
		super();
	}
	
	public AccountType(UUID id, String extId, Short sourceId 
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
    	
    }
    
	
	@Override
    public String toString() {
        return "AccountType{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                
                
                '}';
    }
    
}
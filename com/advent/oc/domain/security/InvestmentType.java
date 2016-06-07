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

public class InvestmentType extends  BaseEntity 
{
	protected String name;
	
	public InvestmentType(){
		super();
	}
	
	public InvestmentType(UUID id, String extId, Short sourceId , String name
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	@Override
    public String toString() {
        return "InvestmentType{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                
                
                '}';
    }
    
}

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

public class InvestmentStrategy extends  BaseEntity 
{
	protected String name;
	protected String description;
	
	public InvestmentStrategy(){
		super();
	}
	
	public InvestmentStrategy(UUID id, String extId, Short sourceId , String name, String description
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.description = description;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public String getDescription() {
	    return this.description;
	}
	
	public void setDescription(String description) {
	    this.description = description;
	}
	
	
	@Override
    public String toString() {
        return "InvestmentStrategy{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                
                
                '}';
    }
    
}

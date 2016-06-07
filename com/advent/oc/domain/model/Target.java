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

public class Target extends  BaseEntity 
{
	protected TargetType targetType;
	protected Scope scope;
	protected BigDecimal value;
	
	public Target(){
		super();
	}
	
	public Target(UUID id, String extId, Short sourceId , TargetType targetType, Scope scope, BigDecimal value
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.targetType = targetType;
        this.scope = scope;
        this.value = value;
    	
    }
    
	
	public TargetType getTargetType() {
	    return this.targetType;
	}
	
	public void setTargetType(TargetType targetType) {
	    this.targetType = targetType;
	}
	
	
	public Scope getScope() {
	    return this.scope;
	}
	
	public void setScope(Scope scope) {
	    this.scope = scope;
	}
	
	
	public BigDecimal getValue() {
	    return this.value;
	}
	
	public void setValue(BigDecimal value) {
	    this.value = value;
	}
	
	
	@Override
    public String toString() {
        return "Target{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", targetType='" + targetType + '\'' +
                ", scope='" + scope + '\'' +
                ", value='" + value + '\'' +
                
                
                '}';
    }
    
}

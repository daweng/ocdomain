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

public class Risk extends  BaseEntity 
{
	protected UUID dataSourceId;
	protected LocalDate time;
	protected RiskType type;
	protected BigDecimal value;
	
	public Risk(){
		super();
	}
	
	public Risk(UUID id, String extId, Short sourceId , UUID dataSourceId, LocalDate time, RiskType type, BigDecimal value
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.dataSourceId = dataSourceId;
        this.time = time;
        this.type = type;
        this.value = value;
    	
    }
    
	
	public UUID getDataSourceId() {
	    return this.dataSourceId;
	}
	
	public void setDataSourceId(UUID dataSourceId) {
	    this.dataSourceId = dataSourceId;
	}
	
	
	public LocalDate getTime() {
	    return this.time;
	}
	
	public void setTime(LocalDate time) {
	    this.time = time;
	}
	
	
	public RiskType getType() {
	    return this.type;
	}
	
	public void setType(RiskType type) {
	    this.type = type;
	}
	
	
	public BigDecimal getValue() {
	    return this.value;
	}
	
	public void setValue(BigDecimal value) {
	    this.value = value;
	}
	
	
	@Override
    public String toString() {
        return "Risk{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", dataSourceId='" + dataSourceId + '\'' +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                
                
                '}';
    }
    
}

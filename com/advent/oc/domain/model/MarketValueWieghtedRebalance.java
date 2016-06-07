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

public class MarketValueWieghtedRebalance extends RebalanceInstructions 
{
	protected UUID targetId;
	protected UUID toleranceId;
	
	public MarketValueWieghtedRebalance(){
		super();
	}
	
	public MarketValueWieghtedRebalance(UUID id, String extId, Short sourceId , UUID targetId, UUID toleranceId
	
	
	
	, UUID modelReferenceId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.toleranceId = toleranceId;
        this.modelReferenceId = modelReferenceId;
    	
    }
    
	
	public UUID getTargetId() {
	    return this.targetId;
	}
	
	public void setTargetId(UUID targetId) {
	    this.targetId = targetId;
	}
	
	
	public UUID getToleranceId() {
	    return this.toleranceId;
	}
	
	public void setToleranceId(UUID toleranceId) {
	    this.toleranceId = toleranceId;
	}
	
	
	@Override
    public String toString() {
        return "MarketValueWieghtedRebalance{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", targetId='" + targetId + '\'' +
                ", toleranceId='" + toleranceId + '\'' +
                
                super.toString() +
                '}';
    }
    
}

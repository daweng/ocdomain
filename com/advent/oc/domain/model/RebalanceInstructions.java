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

public class RebalanceInstructions extends  BaseEntity 
{
	protected UUID modelReferenceId;
	
	public RebalanceInstructions(){
		super();
	}
	
	public RebalanceInstructions(UUID id, String extId, Short sourceId 
	, UUID modelReferenceId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.modelReferenceId = modelReferenceId;
    	
    }
    
	
	public UUID getModelReferenceId() {
	    return this.modelReferenceId;
	}
	
	public void setModelReferenceId(UUID modelReferenceId) {
	    this.modelReferenceId = modelReferenceId;
	}
	
	
	@Override
    public String toString() {
        return "RebalanceInstructions{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", modelReferenceId='" + modelReferenceId + '\'' +
                
                
                '}';
    }
    
}

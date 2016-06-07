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

public class ModelReference extends  BaseEntity 
{
	protected UUID modelId;
	protected UUID modelCollectionId;
	protected UUID rebalanceInstructionsId;
	
	public ModelReference(){
		super();
	}
	
	public ModelReference(UUID id, String extId, Short sourceId 
	, UUID modelId, UUID modelCollectionId, UUID rebalanceInstructionsId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.modelId = modelId;
        this.modelCollectionId = modelCollectionId;
        this.rebalanceInstructionsId = rebalanceInstructionsId;
    	
    }
    
	
	public UUID getModelId() {
	    return this.modelId;
	}
	
	public void setModelId(UUID modelId) {
	    this.modelId = modelId;
	}
	
	
	public UUID getModelCollectionId() {
	    return this.modelCollectionId;
	}
	
	public void setModelCollectionId(UUID modelCollectionId) {
	    this.modelCollectionId = modelCollectionId;
	}
	
	
	public UUID getRebalanceInstructionsId() {
	    return this.rebalanceInstructionsId;
	}
	
	public void setRebalanceInstructionsId(UUID rebalanceInstructionsId) {
	    this.rebalanceInstructionsId = rebalanceInstructionsId;
	}
	
	
	@Override
    public String toString() {
        return "ModelReference{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", modelId='" + modelId + '\'' +
                ", modelCollectionId='" + modelCollectionId + '\'' +
                ", rebalanceInstructionsId='" + rebalanceInstructionsId + '\'' +
                
                
                '}';
    }
    
}

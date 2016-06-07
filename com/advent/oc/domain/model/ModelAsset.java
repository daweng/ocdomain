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

public class ModelAsset extends Model 
{
	protected boolean isShort;
	protected UUID securityId;
	
	public ModelAsset(){
		super();
	}
	
	public ModelAsset(UUID id, String extId, Short sourceId , boolean isShort, UUID securityId
	
	
	, String modelName, UUID managerId, String modelDescription, LocalDate created, UUID createdById, LocalDate modified, UUID modifiedById, boolean isValid, boolean isPortfolioAssignable, boolean isSharable, UUID rebalanceInstructionsId
	, UUID modelTypeId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.isShort = isShort;
        this.securityId = securityId;
        this.modelName = modelName;
        this.managerId = managerId;
        this.modelDescription = modelDescription;
        this.created = created;
        this.createdById = createdById;
        this.modified = modified;
        this.modifiedById = modifiedById;
        this.isValid = isValid;
        this.isPortfolioAssignable = isPortfolioAssignable;
        this.isSharable = isSharable;
        this.rebalanceInstructionsId = rebalanceInstructionsId;
        this.modelTypeId = modelTypeId;
    	
    }
    
	
	public boolean getIsShort() {
	    return this.isShort;
	}
	
	public void setIsShort(boolean isShort) {
	    this.isShort = isShort;
	}
	
	
	public UUID getSecurityId() {
	    return this.securityId;
	}
	
	public void setSecurityId(UUID securityId) {
	    this.securityId = securityId;
	}
	
	
	@Override
    public String toString() {
        return "ModelAsset{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", isShort='" + isShort + '\'' +
                ", securityId='" + securityId + '\'' +
                
                super.toString() +
                '}';
    }
    
}

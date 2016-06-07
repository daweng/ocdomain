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

public class AssetAllocation extends Model 
{
	
	public AssetAllocation(){
		super();
	}
	
	public AssetAllocation(UUID id, String extId, Short sourceId 
	
	
	, String modelName, UUID managerId, String modelDescription, LocalDate created, UUID createdById, LocalDate modified, UUID modifiedById, boolean isValid, boolean isPortfolioAssignable, boolean isSharable, UUID rebalanceInstructionsId
	, UUID modelTypeId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
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
    
	
	@Override
    public String toString() {
        return "AssetAllocation{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                
                super.toString() +
                '}';
    }
    
}

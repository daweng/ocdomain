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

public class Model extends  BaseEntity 
{
	protected String modelName;
	protected UUID managerId;
	protected String modelDescription;
	protected LocalDate created;
	protected UUID createdById;
	protected LocalDate modified;
	protected UUID modifiedById;
	protected boolean isValid;
	protected boolean isPortfolioAssignable;
	protected boolean isSharable;
	protected UUID rebalanceInstructionsId;
	protected UUID modelTypeId;
	
	public Model(){
		super();
	}
	
	public Model(UUID id, String extId, Short sourceId , String modelName, UUID managerId, String modelDescription, LocalDate created, UUID createdById, LocalDate modified, UUID modifiedById, boolean isValid, boolean isPortfolioAssignable, boolean isSharable, UUID rebalanceInstructionsId
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
    
	
	public String getModelName() {
	    return this.modelName;
	}
	
	public void setModelName(String modelName) {
	    this.modelName = modelName;
	}
	
	
	public UUID getManagerId() {
	    return this.managerId;
	}
	
	public void setManagerId(UUID managerId) {
	    this.managerId = managerId;
	}
	
	
	public String getModelDescription() {
	    return this.modelDescription;
	}
	
	public void setModelDescription(String modelDescription) {
	    this.modelDescription = modelDescription;
	}
	
	
	public LocalDate getCreated() {
	    return this.created;
	}
	
	public void setCreated(LocalDate created) {
	    this.created = created;
	}
	
	
	public UUID getCreatedById() {
	    return this.createdById;
	}
	
	public void setCreatedById(UUID createdById) {
	    this.createdById = createdById;
	}
	
	
	public LocalDate getModified() {
	    return this.modified;
	}
	
	public void setModified(LocalDate modified) {
	    this.modified = modified;
	}
	
	
	public UUID getModifiedById() {
	    return this.modifiedById;
	}
	
	public void setModifiedById(UUID modifiedById) {
	    this.modifiedById = modifiedById;
	}
	
	
	public boolean getIsValid() {
	    return this.isValid;
	}
	
	public void setIsValid(boolean isValid) {
	    this.isValid = isValid;
	}
	
	
	public boolean getIsPortfolioAssignable() {
	    return this.isPortfolioAssignable;
	}
	
	public void setIsPortfolioAssignable(boolean isPortfolioAssignable) {
	    this.isPortfolioAssignable = isPortfolioAssignable;
	}
	
	
	public boolean getIsSharable() {
	    return this.isSharable;
	}
	
	public void setIsSharable(boolean isSharable) {
	    this.isSharable = isSharable;
	}
	
	
	public UUID getRebalanceInstructionsId() {
	    return this.rebalanceInstructionsId;
	}
	
	public void setRebalanceInstructionsId(UUID rebalanceInstructionsId) {
	    this.rebalanceInstructionsId = rebalanceInstructionsId;
	}
	
	
	public UUID getModelTypeId() {
	    return this.modelTypeId;
	}
	
	public void setModelTypeId(UUID modelTypeId) {
	    this.modelTypeId = modelTypeId;
	}
	
	
	@Override
    public String toString() {
        return "Model{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", modelName='" + modelName + '\'' +
                ", managerId='" + managerId + '\'' +
                ", modelDescription='" + modelDescription + '\'' +
                ", created='" + created + '\'' +
                ", createdById='" + createdById + '\'' +
                ", modified='" + modified + '\'' +
                ", modifiedById='" + modifiedById + '\'' +
                ", isValid='" + isValid + '\'' +
                ", isPortfolioAssignable='" + isPortfolioAssignable + '\'' +
                ", isSharable='" + isSharable + '\'' +
                ", rebalanceInstructionsId='" + rebalanceInstructionsId + '\'' +
                ", modelTypeId='" + modelTypeId + '\'' +
                
                
                '}';
    }
    
}

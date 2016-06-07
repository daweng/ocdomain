package com.advent.oc.domain.classification;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Classification extends  BaseEntity 
{
	protected String name;
	protected UUID criteriaId;
	protected String description;
	protected UUID typeId;
	
	public Classification(){
		super();
	}
	
	public Classification(UUID id, String extId, Short sourceId , String name, UUID criteriaId, String description
	, UUID typeId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.criteriaId = criteriaId;
        this.description = description;
        this.typeId = typeId;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public UUID getCriteriaId() {
	    return this.criteriaId;
	}
	
	public void setCriteriaId(UUID criteriaId) {
	    this.criteriaId = criteriaId;
	}
	
	
	public String getDescription() {
	    return this.description;
	}
	
	public void setDescription(String description) {
	    this.description = description;
	}
	
	
	public UUID getTypeId() {
	    return this.typeId;
	}
	
	public void setTypeId(UUID typeId) {
	    this.typeId = typeId;
	}
	
	
	@Override
    public String toString() {
        return "Classification{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", criteriaId='" + criteriaId + '\'' +
                ", description='" + description + '\'' +
                ", typeId='" + typeId + '\'' +
                
                
                '}';
    }
    
}

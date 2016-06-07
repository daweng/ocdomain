package com.advent.oc.domain.auth;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Permission extends  BaseEntity 
{
	protected UUID subjectId;
	protected UUID activityId;
	protected UUID resourceId;
	
	public Permission(){
		super();
	}
	
	public Permission(UUID id, String extId, Short sourceId , UUID subjectId, UUID activityId, UUID resourceId
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.subjectId = subjectId;
        this.activityId = activityId;
        this.resourceId = resourceId;
    	
    }
    
	
	public UUID getSubjectId() {
	    return this.subjectId;
	}
	
	public void setSubjectId(UUID subjectId) {
	    this.subjectId = subjectId;
	}
	
	
	public UUID getActivityId() {
	    return this.activityId;
	}
	
	public void setActivityId(UUID activityId) {
	    this.activityId = activityId;
	}
	
	
	public UUID getResourceId() {
	    return this.resourceId;
	}
	
	public void setResourceId(UUID resourceId) {
	    this.resourceId = resourceId;
	}
	
	
	@Override
    public String toString() {
        return "Permission{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", subjectId='" + subjectId + '\'' +
                ", activityId='" + activityId + '\'' +
                ", resourceId='" + resourceId + '\'' +
                
                
                '}';
    }
    
}

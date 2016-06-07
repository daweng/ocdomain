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

public class ClassificationSystem extends  BaseEntity 
{
	protected String name;
	protected String description;
	protected boolean isHierarchical;
	protected int depth;
	protected UUID targetId;
	
	public ClassificationSystem(){
		super();
	}
	
	public ClassificationSystem(UUID id, String extId, Short sourceId , String name, String description, boolean isHierarchical, int depth, UUID targetId
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.description = description;
        this.isHierarchical = isHierarchical;
        this.depth = depth;
        this.targetId = targetId;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public String getDescription() {
	    return this.description;
	}
	
	public void setDescription(String description) {
	    this.description = description;
	}
	
	
	public boolean getIsHierarchical() {
	    return this.isHierarchical;
	}
	
	public void setIsHierarchical(boolean isHierarchical) {
	    this.isHierarchical = isHierarchical;
	}
	
	
	public int getDepth() {
	    return this.depth;
	}
	
	public void setDepth(int depth) {
	    this.depth = depth;
	}
	
	
	public UUID getTargetId() {
	    return this.targetId;
	}
	
	public void setTargetId(UUID targetId) {
	    this.targetId = targetId;
	}
	
	
	@Override
    public String toString() {
        return "ClassificationSystem{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isHierarchical='" + isHierarchical + '\'' +
                ", depth='" + depth + '\'' +
                ", targetId='" + targetId + '\'' +
                
                
                '}';
    }
    
}

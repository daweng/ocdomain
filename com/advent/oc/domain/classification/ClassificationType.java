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

public class ClassificationType extends  BaseEntity 
{
	protected String name;
	protected String description;
	protected int level;
	protected boolean isRoot;
	protected boolean isLeaf;
	protected UUID systemId;
	//self reference
	protected UUID parentClassificationTypeId ;
	
	public ClassificationType(){
		super();
	}
	
	public ClassificationType(UUID id, String extId, Short sourceId , String name, String description, int level, boolean isRoot, boolean isLeaf
	, UUID systemId
	, UUID parentClassificationTypeId 
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.description = description;
        this.level = level;
        this.isRoot = isRoot;
        this.isLeaf = isLeaf;
        this.systemId = systemId;
    	this.parentClassificationTypeId  = parentClassificationTypeId ;
    	
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
	
	
	public int getLevel() {
	    return this.level;
	}
	
	public void setLevel(int level) {
	    this.level = level;
	}
	
	
	public boolean getIsRoot() {
	    return this.isRoot;
	}
	
	public void setIsRoot(boolean isRoot) {
	    this.isRoot = isRoot;
	}
	
	
	public boolean getIsLeaf() {
	    return this.isLeaf;
	}
	
	public void setIsLeaf(boolean isLeaf) {
	    this.isLeaf = isLeaf;
	}
	
	
	public UUID getSystemId() {
	    return this.systemId;
	}
	
	public void setSystemId(UUID systemId) {
	    this.systemId = systemId;
	}
	
	
	public UUID getParentClassificationTypeId () {
	    return this.parentClassificationTypeId ;
	}
	
	public void setParentClassificationTypeId (UUID parentClassificationTypeId ) {
	    this.parentClassificationTypeId  = parentClassificationTypeId ;
	}
	
	
	@Override
    public String toString() {
        return "ClassificationType{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", level='" + level + '\'' +
                ", isRoot='" + isRoot + '\'' +
                ", isLeaf='" + isLeaf + '\'' +
                ", systemId='" + systemId + '\'' +
                ", parentClassificationTypeId ='" + parentClassificationTypeId  + '\'' +
                
                
                '}';
    }
    
}

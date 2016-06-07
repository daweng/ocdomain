package com.advent.oc.domain.legalentity;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LegalEntity extends  BaseEntity 
{
	protected String name;
	protected UUID domicileId;
	
	public LegalEntity(){
		super();
	}
	
	public LegalEntity(UUID id, String extId, Short sourceId , String name, UUID domicileId
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.domicileId = domicileId;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public UUID getDomicileId() {
	    return this.domicileId;
	}
	
	public void setDomicileId(UUID domicileId) {
	    this.domicileId = domicileId;
	}
	
	
	@Override
    public String toString() {
        return "LegalEntity{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", domicileId='" + domicileId + '\'' +
                
                
                '}';
    }
    
}

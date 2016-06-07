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

public class Individual extends LegalEntity 
{
	
	public Individual(){
		super();
	}
	
	public Individual(UUID id, String extId, Short sourceId 
	
	
	, String name, UUID domicileId
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.domicileId = domicileId;
    	
    }
    
	
	@Override
    public String toString() {
        return "Individual{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                
                super.toString() +
                '}';
    }
    
}

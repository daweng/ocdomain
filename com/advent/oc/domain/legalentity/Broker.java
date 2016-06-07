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

public class Broker extends Organization 
{
	protected String name;
	protected UUID domicileCountryId;
	
	public Broker(){
		super();
	}
	
	public Broker(UUID id, String extId, Short sourceId , String name, UUID domicileCountryId
	
	
	
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.domicileCountryId = domicileCountryId;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public UUID getDomicileCountryId() {
	    return this.domicileCountryId;
	}
	
	public void setDomicileCountryId(UUID domicileCountryId) {
	    this.domicileCountryId = domicileCountryId;
	}
	
	
	@Override
    public String toString() {
        return "Broker{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", domicileCountryId='" + domicileCountryId + '\'' +
                
                super.toString() +
                '}';
    }
    
}

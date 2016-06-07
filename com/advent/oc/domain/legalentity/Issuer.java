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

public class Issuer extends Organization 
{
	protected String gicsCode;
	protected String name;
	protected UUID domicileCountryId;
	
	public Issuer(){
		super();
	}
	
	public Issuer(UUID id, String extId, Short sourceId , String gicsCode, String name, UUID domicileCountryId
	
	
	
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.gicsCode = gicsCode;
        this.name = name;
        this.domicileCountryId = domicileCountryId;
    	
    }
    
	
	public String getGicsCode() {
	    return this.gicsCode;
	}
	
	public void setGicsCode(String gicsCode) {
	    this.gicsCode = gicsCode;
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
        return "Issuer{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", gicsCode='" + gicsCode + '\'' +
                ", name='" + name + '\'' +
                ", domicileCountryId='" + domicileCountryId + '\'' +
                
                super.toString() +
                '}';
    }
    
}

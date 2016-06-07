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

public class Investor extends Individual 
{
	protected String stateOfResidence;
	protected String stateOfTaxation;
	protected int marginalTaxRate;
	
	public Investor(){
		super();
	}
	
	public Investor(UUID id, String extId, Short sourceId , String stateOfResidence, String stateOfTaxation, int marginalTaxRate
	
	
	
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.stateOfResidence = stateOfResidence;
        this.stateOfTaxation = stateOfTaxation;
        this.marginalTaxRate = marginalTaxRate;
    	
    }
    
	
	public String getStateOfResidence() {
	    return this.stateOfResidence;
	}
	
	public void setStateOfResidence(String stateOfResidence) {
	    this.stateOfResidence = stateOfResidence;
	}
	
	
	public String getStateOfTaxation() {
	    return this.stateOfTaxation;
	}
	
	public void setStateOfTaxation(String stateOfTaxation) {
	    this.stateOfTaxation = stateOfTaxation;
	}
	
	
	public int getMarginalTaxRate() {
	    return this.marginalTaxRate;
	}
	
	public void setMarginalTaxRate(int marginalTaxRate) {
	    this.marginalTaxRate = marginalTaxRate;
	}
	
	
	@Override
    public String toString() {
        return "Investor{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", stateOfResidence='" + stateOfResidence + '\'' +
                ", stateOfTaxation='" + stateOfTaxation + '\'' +
                ", marginalTaxRate='" + marginalTaxRate + '\'' +
                
                super.toString() +
                '}';
    }
    
}

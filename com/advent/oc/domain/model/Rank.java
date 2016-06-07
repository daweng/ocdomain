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

public class Rank extends  BaseEntity 
{
	protected int openingRank;
	protected int closingRank;
	
	public Rank(){
		super();
	}
	
	public Rank(UUID id, String extId, Short sourceId , int openingRank, int closingRank
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.openingRank = openingRank;
        this.closingRank = closingRank;
    	
    }
    
	
	public int getOpeningRank() {
	    return this.openingRank;
	}
	
	public void setOpeningRank(int openingRank) {
	    this.openingRank = openingRank;
	}
	
	
	public int getClosingRank() {
	    return this.closingRank;
	}
	
	public void setClosingRank(int closingRank) {
	    this.closingRank = closingRank;
	}
	
	
	@Override
    public String toString() {
        return "Rank{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", openingRank='" + openingRank + '\'' +
                ", closingRank='" + closingRank + '\'' +
                
                
                '}';
    }
    
}

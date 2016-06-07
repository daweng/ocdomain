package com.advent.oc.domain.marketdata;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ratings extends  BaseEntity 
{
	protected RatingSource source;
	protected String rating;
	protected UUID securityId;
	
	public Ratings(){
		super();
	}
	
	public Ratings(UUID id, String extId, Short sourceId , RatingSource source, String rating
	, UUID securityId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.source = source;
        this.rating = rating;
        this.securityId = securityId;
    	
    }
    
	
	public RatingSource getSource() {
	    return this.source;
	}
	
	public void setSource(RatingSource source) {
	    this.source = source;
	}
	
	
	public String getRating() {
	    return this.rating;
	}
	
	public void setRating(String rating) {
	    this.rating = rating;
	}
	
	
	public UUID getSecurityId() {
	    return this.securityId;
	}
	
	public void setSecurityId(UUID securityId) {
	    this.securityId = securityId;
	}
	
	
	@Override
    public String toString() {
        return "Ratings{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", source='" + source + '\'' +
                ", rating='" + rating + '\'' +
                ", securityId='" + securityId + '\'' +
                
                
                '}';
    }
    
}

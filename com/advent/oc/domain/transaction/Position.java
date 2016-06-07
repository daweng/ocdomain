package com.advent.oc.domain.transaction;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Position extends  BaseEntity 
{
	protected BigDecimal initialQuantity;
	protected BigDecimal openQuantity;
	protected BigDecimal closedQuantity;
	protected boolean isShort;
	protected UUID securityId;
	protected UUID accountId;
	
	public Position(){
		super();
	}
	
	public Position(UUID id, String extId, Short sourceId , BigDecimal initialQuantity, BigDecimal openQuantity, BigDecimal closedQuantity, boolean isShort, UUID securityId
	, UUID accountId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.initialQuantity = initialQuantity;
        this.openQuantity = openQuantity;
        this.closedQuantity = closedQuantity;
        this.isShort = isShort;
        this.securityId = securityId;
        this.accountId = accountId;
    	
    }
    
	
	public BigDecimal getInitialQuantity() {
	    return this.initialQuantity;
	}
	
	public void setInitialQuantity(BigDecimal initialQuantity) {
	    this.initialQuantity = initialQuantity;
	}
	
	
	public BigDecimal getOpenQuantity() {
	    return this.openQuantity;
	}
	
	public void setOpenQuantity(BigDecimal openQuantity) {
	    this.openQuantity = openQuantity;
	}
	
	
	public BigDecimal getClosedQuantity() {
	    return this.closedQuantity;
	}
	
	public void setClosedQuantity(BigDecimal closedQuantity) {
	    this.closedQuantity = closedQuantity;
	}
	
	
	public boolean getIsShort() {
	    return this.isShort;
	}
	
	public void setIsShort(boolean isShort) {
	    this.isShort = isShort;
	}
	
	
	public UUID getSecurityId() {
	    return this.securityId;
	}
	
	public void setSecurityId(UUID securityId) {
	    this.securityId = securityId;
	}
	
	
	public UUID getAccountId() {
	    return this.accountId;
	}
	
	public void setAccountId(UUID accountId) {
	    this.accountId = accountId;
	}
	
	
	@Override
    public String toString() {
        return "Position{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", initialQuantity='" + initialQuantity + '\'' +
                ", openQuantity='" + openQuantity + '\'' +
                ", closedQuantity='" + closedQuantity + '\'' +
                ", isShort='" + isShort + '\'' +
                ", securityId='" + securityId + '\'' +
                ", accountId='" + accountId + '\'' +
                
                
                '}';
    }
    
}

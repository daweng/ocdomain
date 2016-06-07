package com.advent.oc.domain.account;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccountRelationship extends  BaseEntity 
{
	protected AccountRelationshipType type;
	protected UUID accountId;
	protected UUID legalEntityId;
	
	public AccountRelationship(){
		super();
	}
	
	public AccountRelationship(UUID id, String extId, Short sourceId , AccountRelationshipType type
	, UUID accountId, UUID legalEntityId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.type = type;
        this.accountId = accountId;
        this.legalEntityId = legalEntityId;
    	
    }
    
	
	public AccountRelationshipType getType() {
	    return this.type;
	}
	
	public void setType(AccountRelationshipType type) {
	    this.type = type;
	}
	
	
	public UUID getAccountId() {
	    return this.accountId;
	}
	
	public void setAccountId(UUID accountId) {
	    this.accountId = accountId;
	}
	
	
	public UUID getLegalEntityId() {
	    return this.legalEntityId;
	}
	
	public void setLegalEntityId(UUID legalEntityId) {
	    this.legalEntityId = legalEntityId;
	}
	
	
	@Override
    public String toString() {
        return "AccountRelationship{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", type='" + type + '\'' +
                ", accountId='" + accountId + '\'' +
                ", legalEntityId='" + legalEntityId + '\'' +
                
                
                '}';
    }
    
}

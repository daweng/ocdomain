package com.advent.oc.domain.order;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderAllocation extends  BaseEntity 
{
	protected UUID accountId;
	protected BigDecimal quantity;
	protected UUID orderId;
	
	public OrderAllocation(){
		super();
	}
	
	public OrderAllocation(UUID id, String extId, Short sourceId , UUID accountId, BigDecimal quantity
	, UUID orderId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.accountId = accountId;
        this.quantity = quantity;
        this.orderId = orderId;
    	
    }
    
	
	public UUID getAccountId() {
	    return this.accountId;
	}
	
	public void setAccountId(UUID accountId) {
	    this.accountId = accountId;
	}
	
	
	public BigDecimal getQuantity() {
	    return this.quantity;
	}
	
	public void setQuantity(BigDecimal quantity) {
	    this.quantity = quantity;
	}
	
	
	public UUID getOrderId() {
	    return this.orderId;
	}
	
	public void setOrderId(UUID orderId) {
	    this.orderId = orderId;
	}
	
	
	@Override
    public String toString() {
        return "OrderAllocation{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", accountId='" + accountId + '\'' +
                ", quantity='" + quantity + '\'' +
                ", orderId='" + orderId + '\'' +
                
                
                '}';
    }
    
}

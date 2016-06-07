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

public class JournalEntry extends  BaseEntity 
{
	protected boolean isSettlement;
	protected UUID securityId;
	protected String description;
	protected BigDecimal price;
	protected BigDecimal quantity;
	protected BigDecimal amount;
	protected BigDecimal settlementFXRate;
	protected InventoryState state;
	protected String lotId;
	protected UUID accountId;
	protected UUID transactionId;
	
	public JournalEntry(){
		super();
	}
	
	public JournalEntry(UUID id, String extId, Short sourceId , boolean isSettlement, UUID securityId, String description, BigDecimal price, BigDecimal quantity, BigDecimal amount, BigDecimal settlementFXRate, InventoryState state, String lotId
	, UUID accountId, UUID transactionId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.isSettlement = isSettlement;
        this.securityId = securityId;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.amount = amount;
        this.settlementFXRate = settlementFXRate;
        this.state = state;
        this.lotId = lotId;
        this.accountId = accountId;
        this.transactionId = transactionId;
    	
    }
    
	
	public boolean getIsSettlement() {
	    return this.isSettlement;
	}
	
	public void setIsSettlement(boolean isSettlement) {
	    this.isSettlement = isSettlement;
	}
	
	
	public UUID getSecurityId() {
	    return this.securityId;
	}
	
	public void setSecurityId(UUID securityId) {
	    this.securityId = securityId;
	}
	
	
	public String getDescription() {
	    return this.description;
	}
	
	public void setDescription(String description) {
	    this.description = description;
	}
	
	
	public BigDecimal getPrice() {
	    return this.price;
	}
	
	public void setPrice(BigDecimal price) {
	    this.price = price;
	}
	
	
	public BigDecimal getQuantity() {
	    return this.quantity;
	}
	
	public void setQuantity(BigDecimal quantity) {
	    this.quantity = quantity;
	}
	
	
	public BigDecimal getAmount() {
	    return this.amount;
	}
	
	public void setAmount(BigDecimal amount) {
	    this.amount = amount;
	}
	
	
	public BigDecimal getSettlementFXRate() {
	    return this.settlementFXRate;
	}
	
	public void setSettlementFXRate(BigDecimal settlementFXRate) {
	    this.settlementFXRate = settlementFXRate;
	}
	
	
	public InventoryState getState() {
	    return this.state;
	}
	
	public void setState(InventoryState state) {
	    this.state = state;
	}
	
	
	public String getLotId() {
	    return this.lotId;
	}
	
	public void setLotId(String lotId) {
	    this.lotId = lotId;
	}
	
	
	public UUID getAccountId() {
	    return this.accountId;
	}
	
	public void setAccountId(UUID accountId) {
	    this.accountId = accountId;
	}
	
	
	public UUID getTransactionId() {
	    return this.transactionId;
	}
	
	public void setTransactionId(UUID transactionId) {
	    this.transactionId = transactionId;
	}
	
	
	@Override
    public String toString() {
        return "JournalEntry{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", isSettlement='" + isSettlement + '\'' +
                ", securityId='" + securityId + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                ", amount='" + amount + '\'' +
                ", settlementFXRate='" + settlementFXRate + '\'' +
                ", state='" + state + '\'' +
                ", lotId='" + lotId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                
                
                '}';
    }
    
}

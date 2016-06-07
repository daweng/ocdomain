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

public class TaxLot extends  BaseEntity 
{
	protected LocalDate openDate;
	protected UUID securityId;
	protected boolean isShort;
	protected BigDecimal costLocal;
	protected BigDecimal costBook;
	protected BigDecimal openQuantity;
	protected ClosingMethod closingMethod;
	protected boolean reinvestDividends;
	protected UUID custodianId;
	protected InventoryState inventoryState;
	protected Date closeTradeDate;
	protected UUID accountId;
	protected UUID positionId;
	
	public TaxLot(){
		super();
	}
	
	public TaxLot(UUID id, String extId, Short sourceId , LocalDate openDate, UUID securityId, boolean isShort, BigDecimal costLocal, BigDecimal costBook, BigDecimal openQuantity, ClosingMethod closingMethod, boolean reinvestDividends, UUID custodianId, InventoryState inventoryState, Date closeTradeDate
	, UUID accountId, UUID positionId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.openDate = openDate;
        this.securityId = securityId;
        this.isShort = isShort;
        this.costLocal = costLocal;
        this.costBook = costBook;
        this.openQuantity = openQuantity;
        this.closingMethod = closingMethod;
        this.reinvestDividends = reinvestDividends;
        this.custodianId = custodianId;
        this.inventoryState = inventoryState;
        this.closeTradeDate = closeTradeDate;
        this.accountId = accountId;
        this.positionId = positionId;
    	
    }
    
	
	public LocalDate getOpenDate() {
	    return this.openDate;
	}
	
	public void setOpenDate(LocalDate openDate) {
	    this.openDate = openDate;
	}
	
	
	public UUID getSecurityId() {
	    return this.securityId;
	}
	
	public void setSecurityId(UUID securityId) {
	    this.securityId = securityId;
	}
	
	
	public boolean getIsShort() {
	    return this.isShort;
	}
	
	public void setIsShort(boolean isShort) {
	    this.isShort = isShort;
	}
	
	
	public BigDecimal getCostLocal() {
	    return this.costLocal;
	}
	
	public void setCostLocal(BigDecimal costLocal) {
	    this.costLocal = costLocal;
	}
	
	
	public BigDecimal getCostBook() {
	    return this.costBook;
	}
	
	public void setCostBook(BigDecimal costBook) {
	    this.costBook = costBook;
	}
	
	
	public BigDecimal getOpenQuantity() {
	    return this.openQuantity;
	}
	
	public void setOpenQuantity(BigDecimal openQuantity) {
	    this.openQuantity = openQuantity;
	}
	
	
	public ClosingMethod getClosingMethod() {
	    return this.closingMethod;
	}
	
	public void setClosingMethod(ClosingMethod closingMethod) {
	    this.closingMethod = closingMethod;
	}
	
	
	public boolean getReinvestDividends() {
	    return this.reinvestDividends;
	}
	
	public void setReinvestDividends(boolean reinvestDividends) {
	    this.reinvestDividends = reinvestDividends;
	}
	
	
	public UUID getCustodianId() {
	    return this.custodianId;
	}
	
	public void setCustodianId(UUID custodianId) {
	    this.custodianId = custodianId;
	}
	
	
	public InventoryState getInventoryState() {
	    return this.inventoryState;
	}
	
	public void setInventoryState(InventoryState inventoryState) {
	    this.inventoryState = inventoryState;
	}
	
	
	public Date getCloseTradeDate() {
	    return this.closeTradeDate;
	}
	
	public void setCloseTradeDate(Date closeTradeDate) {
	    this.closeTradeDate = closeTradeDate;
	}
	
	
	public UUID getAccountId() {
	    return this.accountId;
	}
	
	public void setAccountId(UUID accountId) {
	    this.accountId = accountId;
	}
	
	
	public UUID getPositionId() {
	    return this.positionId;
	}
	
	public void setPositionId(UUID positionId) {
	    this.positionId = positionId;
	}
	
	
	@Override
    public String toString() {
        return "TaxLot{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", openDate='" + openDate + '\'' +
                ", securityId='" + securityId + '\'' +
                ", isShort='" + isShort + '\'' +
                ", costLocal='" + costLocal + '\'' +
                ", costBook='" + costBook + '\'' +
                ", openQuantity='" + openQuantity + '\'' +
                ", closingMethod='" + closingMethod + '\'' +
                ", reinvestDividends='" + reinvestDividends + '\'' +
                ", custodianId='" + custodianId + '\'' +
                ", inventoryState='" + inventoryState + '\'' +
                ", closeTradeDate='" + closeTradeDate + '\'' +
                ", accountId='" + accountId + '\'' +
                ", positionId='" + positionId + '\'' +
                
                
                '}';
    }
    
}

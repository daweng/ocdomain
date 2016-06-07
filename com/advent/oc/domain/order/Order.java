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

public class Order extends  BaseEntity 
{
	protected LocalDate orderDate;
	protected LocalDate orderSettleDate;
	protected TransactionType transactionType;
	protected UUID securityId;
	protected BigDecimal quantity;
	protected BigDecimal estimatedPrice;
	protected BigDecimal commission;
	protected BigDecimal fees;
	protected BigDecimal estimatedAmount;
	protected TimeInForce timeInForce;
	protected OrderType orderType;
	protected boolean reinvestDividends;
	protected UUID brokerId;
	
	public Order(){
		super();
	}
	
	public Order(UUID id, String extId, Short sourceId , LocalDate orderDate, LocalDate orderSettleDate, TransactionType transactionType, UUID securityId, BigDecimal quantity, BigDecimal estimatedPrice, BigDecimal commission, BigDecimal fees, BigDecimal estimatedAmount, TimeInForce timeInForce, OrderType orderType, boolean reinvestDividends, UUID brokerId
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.orderDate = orderDate;
        this.orderSettleDate = orderSettleDate;
        this.transactionType = transactionType;
        this.securityId = securityId;
        this.quantity = quantity;
        this.estimatedPrice = estimatedPrice;
        this.commission = commission;
        this.fees = fees;
        this.estimatedAmount = estimatedAmount;
        this.timeInForce = timeInForce;
        this.orderType = orderType;
        this.reinvestDividends = reinvestDividends;
        this.brokerId = brokerId;
    	
    }
    
	
	public LocalDate getOrderDate() {
	    return this.orderDate;
	}
	
	public void setOrderDate(LocalDate orderDate) {
	    this.orderDate = orderDate;
	}
	
	
	public LocalDate getOrderSettleDate() {
	    return this.orderSettleDate;
	}
	
	public void setOrderSettleDate(LocalDate orderSettleDate) {
	    this.orderSettleDate = orderSettleDate;
	}
	
	
	public TransactionType getTransactionType() {
	    return this.transactionType;
	}
	
	public void setTransactionType(TransactionType transactionType) {
	    this.transactionType = transactionType;
	}
	
	
	public UUID getSecurityId() {
	    return this.securityId;
	}
	
	public void setSecurityId(UUID securityId) {
	    this.securityId = securityId;
	}
	
	
	public BigDecimal getQuantity() {
	    return this.quantity;
	}
	
	public void setQuantity(BigDecimal quantity) {
	    this.quantity = quantity;
	}
	
	
	public BigDecimal getEstimatedPrice() {
	    return this.estimatedPrice;
	}
	
	public void setEstimatedPrice(BigDecimal estimatedPrice) {
	    this.estimatedPrice = estimatedPrice;
	}
	
	
	public BigDecimal getCommission() {
	    return this.commission;
	}
	
	public void setCommission(BigDecimal commission) {
	    this.commission = commission;
	}
	
	
	public BigDecimal getFees() {
	    return this.fees;
	}
	
	public void setFees(BigDecimal fees) {
	    this.fees = fees;
	}
	
	
	public BigDecimal getEstimatedAmount() {
	    return this.estimatedAmount;
	}
	
	public void setEstimatedAmount(BigDecimal estimatedAmount) {
	    this.estimatedAmount = estimatedAmount;
	}
	
	
	public TimeInForce getTimeInForce() {
	    return this.timeInForce;
	}
	
	public void setTimeInForce(TimeInForce timeInForce) {
	    this.timeInForce = timeInForce;
	}
	
	
	public OrderType getOrderType() {
	    return this.orderType;
	}
	
	public void setOrderType(OrderType orderType) {
	    this.orderType = orderType;
	}
	
	
	public boolean getReinvestDividends() {
	    return this.reinvestDividends;
	}
	
	public void setReinvestDividends(boolean reinvestDividends) {
	    this.reinvestDividends = reinvestDividends;
	}
	
	
	public UUID getBrokerId() {
	    return this.brokerId;
	}
	
	public void setBrokerId(UUID brokerId) {
	    this.brokerId = brokerId;
	}
	
	
	@Override
    public String toString() {
        return "Order{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", orderDate='" + orderDate + '\'' +
                ", orderSettleDate='" + orderSettleDate + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", securityId='" + securityId + '\'' +
                ", quantity='" + quantity + '\'' +
                ", estimatedPrice='" + estimatedPrice + '\'' +
                ", commission='" + commission + '\'' +
                ", fees='" + fees + '\'' +
                ", estimatedAmount='" + estimatedAmount + '\'' +
                ", timeInForce='" + timeInForce + '\'' +
                ", orderType='" + orderType + '\'' +
                ", reinvestDividends='" + reinvestDividends + '\'' +
                ", brokerId='" + brokerId + '\'' +
                
                
                '}';
    }
    
}

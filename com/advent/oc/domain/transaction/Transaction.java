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

public class Transaction extends  BaseEntity 
{
	protected String transactionId;
	protected LocalDate transactionDate;
	protected TransactionType transactionType;
	protected LocalDate tradeDate;
	protected UUID securityId;
	protected BigDecimal price;
	protected BigDecimal quantity;
	protected BigDecimal fees;
	protected BigDecimal commission;
	protected BigDecimal amount;
	protected UUID tradeCurrencyId;
	protected LocalDate settleDate;
	protected UUID settleCurrencyId;
	protected UUID custodianId;
	protected UUID accountId;
	
	public Transaction(){
		super();
	}
	
	public Transaction(UUID id, String extId, Short sourceId , String transactionId, LocalDate transactionDate, TransactionType transactionType, LocalDate tradeDate, UUID securityId, BigDecimal price, BigDecimal quantity, BigDecimal fees, BigDecimal commission, BigDecimal amount, UUID tradeCurrencyId, LocalDate settleDate, UUID settleCurrencyId, UUID custodianId
	, UUID accountId
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.tradeDate = tradeDate;
        this.securityId = securityId;
        this.price = price;
        this.quantity = quantity;
        this.fees = fees;
        this.commission = commission;
        this.amount = amount;
        this.tradeCurrencyId = tradeCurrencyId;
        this.settleDate = settleDate;
        this.settleCurrencyId = settleCurrencyId;
        this.custodianId = custodianId;
        this.accountId = accountId;
    	
    }
    
	
	public String getTransactionId() {
	    return this.transactionId;
	}
	
	public void setTransactionId(String transactionId) {
	    this.transactionId = transactionId;
	}
	
	
	public LocalDate getTransactionDate() {
	    return this.transactionDate;
	}
	
	public void setTransactionDate(LocalDate transactionDate) {
	    this.transactionDate = transactionDate;
	}
	
	
	public TransactionType getTransactionType() {
	    return this.transactionType;
	}
	
	public void setTransactionType(TransactionType transactionType) {
	    this.transactionType = transactionType;
	}
	
	
	public LocalDate getTradeDate() {
	    return this.tradeDate;
	}
	
	public void setTradeDate(LocalDate tradeDate) {
	    this.tradeDate = tradeDate;
	}
	
	
	public UUID getSecurityId() {
	    return this.securityId;
	}
	
	public void setSecurityId(UUID securityId) {
	    this.securityId = securityId;
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
	
	
	public BigDecimal getFees() {
	    return this.fees;
	}
	
	public void setFees(BigDecimal fees) {
	    this.fees = fees;
	}
	
	
	public BigDecimal getCommission() {
	    return this.commission;
	}
	
	public void setCommission(BigDecimal commission) {
	    this.commission = commission;
	}
	
	
	public BigDecimal getAmount() {
	    return this.amount;
	}
	
	public void setAmount(BigDecimal amount) {
	    this.amount = amount;
	}
	
	
	public UUID getTradeCurrencyId() {
	    return this.tradeCurrencyId;
	}
	
	public void setTradeCurrencyId(UUID tradeCurrencyId) {
	    this.tradeCurrencyId = tradeCurrencyId;
	}
	
	
	public LocalDate getSettleDate() {
	    return this.settleDate;
	}
	
	public void setSettleDate(LocalDate settleDate) {
	    this.settleDate = settleDate;
	}
	
	
	public UUID getSettleCurrencyId() {
	    return this.settleCurrencyId;
	}
	
	public void setSettleCurrencyId(UUID settleCurrencyId) {
	    this.settleCurrencyId = settleCurrencyId;
	}
	
	
	public UUID getCustodianId() {
	    return this.custodianId;
	}
	
	public void setCustodianId(UUID custodianId) {
	    this.custodianId = custodianId;
	}
	
	
	public UUID getAccountId() {
	    return this.accountId;
	}
	
	public void setAccountId(UUID accountId) {
	    this.accountId = accountId;
	}
	
	
	@Override
    public String toString() {
        return "Transaction{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", transactionId='" + transactionId + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", tradeDate='" + tradeDate + '\'' +
                ", securityId='" + securityId + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                ", fees='" + fees + '\'' +
                ", commission='" + commission + '\'' +
                ", amount='" + amount + '\'' +
                ", tradeCurrencyId='" + tradeCurrencyId + '\'' +
                ", settleDate='" + settleDate + '\'' +
                ", settleCurrencyId='" + settleCurrencyId + '\'' +
                ", custodianId='" + custodianId + '\'' +
                ", accountId='" + accountId + '\'' +
                
                
                '}';
    }
    
}

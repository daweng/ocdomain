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

public class Account extends  BaseEntity 
{
	protected String code;
	protected String name;
	protected String number;
	protected String taxIdentifier;
	protected String accountStatus;
	protected Date openDate;
	protected Date closeDate;
	protected UUID investmentStrategyId;
	protected UUID modelId;
	protected UUID benchmarkId;
	protected UUID accountTypeId;
	protected UUID taxStatusId;
	protected UUID domicileId;
	protected String bookCurrency;
	protected boolean reinvestDividends;
	protected ClosingMethod closingMethod;
	protected boolean isDiscretionary;
	protected boolean isSeparatelyManaged;
	//self reference
	protected UUID parentAccountId ;
	
	public Account(){
		super();
	}
	
	public Account(UUID id, String extId, Short sourceId , String code, String name, String number, String taxIdentifier, String accountStatus, Date openDate, Date closeDate, UUID investmentStrategyId, UUID modelId, UUID benchmarkId, UUID accountTypeId, UUID taxStatusId, UUID domicileId, String bookCurrency, boolean reinvestDividends, ClosingMethod closingMethod, boolean isDiscretionary, boolean isSeparatelyManaged
	
	, UUID parentAccountId 
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.code = code;
        this.name = name;
        this.number = number;
        this.taxIdentifier = taxIdentifier;
        this.accountStatus = accountStatus;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.investmentStrategyId = investmentStrategyId;
        this.modelId = modelId;
        this.benchmarkId = benchmarkId;
        this.accountTypeId = accountTypeId;
        this.taxStatusId = taxStatusId;
        this.domicileId = domicileId;
        this.bookCurrency = bookCurrency;
        this.reinvestDividends = reinvestDividends;
        this.closingMethod = closingMethod;
        this.isDiscretionary = isDiscretionary;
        this.isSeparatelyManaged = isSeparatelyManaged;
    	this.parentAccountId  = parentAccountId ;
    	
    }
    
	
	public String getCode() {
	    return this.code;
	}
	
	public void setCode(String code) {
	    this.code = code;
	}
	
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public String getNumber() {
	    return this.number;
	}
	
	public void setNumber(String number) {
	    this.number = number;
	}
	
	
	public String getTaxIdentifier() {
	    return this.taxIdentifier;
	}
	
	public void setTaxIdentifier(String taxIdentifier) {
	    this.taxIdentifier = taxIdentifier;
	}
	
	
	public String getAccountStatus() {
	    return this.accountStatus;
	}
	
	public void setAccountStatus(String accountStatus) {
	    this.accountStatus = accountStatus;
	}
	
	
	public Date getOpenDate() {
	    return this.openDate;
	}
	
	public void setOpenDate(Date openDate) {
	    this.openDate = openDate;
	}
	
	
	public Date getCloseDate() {
	    return this.closeDate;
	}
	
	public void setCloseDate(Date closeDate) {
	    this.closeDate = closeDate;
	}
	
	
	public UUID getInvestmentStrategyId() {
	    return this.investmentStrategyId;
	}
	
	public void setInvestmentStrategyId(UUID investmentStrategyId) {
	    this.investmentStrategyId = investmentStrategyId;
	}
	
	
	public UUID getModelId() {
	    return this.modelId;
	}
	
	public void setModelId(UUID modelId) {
	    this.modelId = modelId;
	}
	
	
	public UUID getBenchmarkId() {
	    return this.benchmarkId;
	}
	
	public void setBenchmarkId(UUID benchmarkId) {
	    this.benchmarkId = benchmarkId;
	}
	
	
	public UUID getAccountTypeId() {
	    return this.accountTypeId;
	}
	
	public void setAccountTypeId(UUID accountTypeId) {
	    this.accountTypeId = accountTypeId;
	}
	
	
	public UUID getTaxStatusId() {
	    return this.taxStatusId;
	}
	
	public void setTaxStatusId(UUID taxStatusId) {
	    this.taxStatusId = taxStatusId;
	}
	
	
	public UUID getDomicileId() {
	    return this.domicileId;
	}
	
	public void setDomicileId(UUID domicileId) {
	    this.domicileId = domicileId;
	}
	
	
	public String getBookCurrency() {
	    return this.bookCurrency;
	}
	
	public void setBookCurrency(String bookCurrency) {
	    this.bookCurrency = bookCurrency;
	}
	
	
	public boolean getReinvestDividends() {
	    return this.reinvestDividends;
	}
	
	public void setReinvestDividends(boolean reinvestDividends) {
	    this.reinvestDividends = reinvestDividends;
	}
	
	
	public ClosingMethod getClosingMethod() {
	    return this.closingMethod;
	}
	
	public void setClosingMethod(ClosingMethod closingMethod) {
	    this.closingMethod = closingMethod;
	}
	
	
	public boolean getIsDiscretionary() {
	    return this.isDiscretionary;
	}
	
	public void setIsDiscretionary(boolean isDiscretionary) {
	    this.isDiscretionary = isDiscretionary;
	}
	
	
	public boolean getIsSeparatelyManaged() {
	    return this.isSeparatelyManaged;
	}
	
	public void setIsSeparatelyManaged(boolean isSeparatelyManaged) {
	    this.isSeparatelyManaged = isSeparatelyManaged;
	}
	
	
	public UUID getParentAccountId () {
	    return this.parentAccountId ;
	}
	
	public void setParentAccountId (UUID parentAccountId ) {
	    this.parentAccountId  = parentAccountId ;
	}
	
	
	@Override
    public String toString() {
        return "Account{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", taxIdentifier='" + taxIdentifier + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                ", openDate='" + openDate + '\'' +
                ", closeDate='" + closeDate + '\'' +
                ", investmentStrategyId='" + investmentStrategyId + '\'' +
                ", modelId='" + modelId + '\'' +
                ", benchmarkId='" + benchmarkId + '\'' +
                ", accountTypeId='" + accountTypeId + '\'' +
                ", taxStatusId='" + taxStatusId + '\'' +
                ", domicileId='" + domicileId + '\'' +
                ", bookCurrency='" + bookCurrency + '\'' +
                ", reinvestDividends='" + reinvestDividends + '\'' +
                ", closingMethod='" + closingMethod + '\'' +
                ", isDiscretionary='" + isDiscretionary + '\'' +
                ", isSeparatelyManaged='" + isSeparatelyManaged + '\'' +
                ", parentAccountId ='" + parentAccountId  + '\'' +
                
                
                '}';
    }
    
}

package com.advent.oc.domain.security;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Debt extends Security 
{
	protected Date maturityDate;
	protected BigDecimal parValue;
	protected BigDecimal couponRate;
	protected boolean isCallable;
	protected boolean isZeroCoupon;
	protected Frequency payFrequency;
	protected Date issueDate;
	protected DayCountConvention dayCountConvention;
	protected BusinessDayConvention buisnessDayConvention;
	protected UUID bondInsurerId;
	protected boolean isVariableRate;
	protected Date nextCouponDate;
	protected Date lastCouponDate;
	protected UUID callPutScheduleId;
	protected UUID couponScheduleId;
	protected UUID variableRateScheduleId;
	
	public Debt(){
		super();
	}
	
	public Debt(UUID id, String extId, Short sourceId , Date maturityDate, BigDecimal parValue, BigDecimal couponRate, boolean isCallable, boolean isZeroCoupon, Frequency payFrequency, Date issueDate, DayCountConvention dayCountConvention, BusinessDayConvention buisnessDayConvention, UUID bondInsurerId, boolean isVariableRate, Date nextCouponDate, Date lastCouponDate
	, UUID callPutScheduleId, UUID couponScheduleId, UUID variableRateScheduleId
	
	, String name, String symbol, SymbolType symbolType, String ticker, String cusip, String isin, String sedol, String valoren, CFIDebtGroup secGroup, CFIInstrumentCategory secCategory, SecuritySubGroup secSubGroup, String cfiCode, String ricCode, String figi, String mic, String fisn, UUID localBasisCurrencyId, UUID incomeCurrencyId, UUID riskCurrencyId, UUID crossingCurrencyId, boolean isNotional, String sourceSecType
	, UUID exchangeId, UUID investmentTypeId, UUID issuerId, UUID priceId, UUID securityTypeId
	, UUID parentSecurityId 
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.maturityDate = maturityDate;
        this.parValue = parValue;
        this.couponRate = couponRate;
        this.isCallable = isCallable;
        this.isZeroCoupon = isZeroCoupon;
        this.payFrequency = payFrequency;
        this.issueDate = issueDate;
        this.dayCountConvention = dayCountConvention;
        this.buisnessDayConvention = buisnessDayConvention;
        this.bondInsurerId = bondInsurerId;
        this.isVariableRate = isVariableRate;
        this.nextCouponDate = nextCouponDate;
        this.lastCouponDate = lastCouponDate;
        this.callPutScheduleId = callPutScheduleId;
        this.couponScheduleId = couponScheduleId;
        this.variableRateScheduleId = variableRateScheduleId;
        this.name = name;
        this.symbol = symbol;
        this.symbolType = symbolType;
        this.ticker = ticker;
        this.cusip = cusip;
        this.isin = isin;
        this.sedol = sedol;
        this.valoren = valoren;
        this.secGroup = secGroup;
        this.secCategory = secCategory;
        this.secSubGroup = secSubGroup;
        this.cfiCode = cfiCode;
        this.ricCode = ricCode;
        this.figi = figi;
        this.mic = mic;
        this.fisn = fisn;
        this.localBasisCurrencyId = localBasisCurrencyId;
        this.incomeCurrencyId = incomeCurrencyId;
        this.riskCurrencyId = riskCurrencyId;
        this.crossingCurrencyId = crossingCurrencyId;
        this.isNotional = isNotional;
        this.sourceSecType = sourceSecType;
        this.exchangeId = exchangeId;
        this.investmentTypeId = investmentTypeId;
        this.issuerId = issuerId;
        this.priceId = priceId;
        this.securityTypeId = securityTypeId;
    	this.parentSecurityId  = parentSecurityId ;
    	
    }
    
	
	public Date getMaturityDate() {
	    return this.maturityDate;
	}
	
	public void setMaturityDate(Date maturityDate) {
	    this.maturityDate = maturityDate;
	}
	
	
	public BigDecimal getParValue() {
	    return this.parValue;
	}
	
	public void setParValue(BigDecimal parValue) {
	    this.parValue = parValue;
	}
	
	
	public BigDecimal getCouponRate() {
	    return this.couponRate;
	}
	
	public void setCouponRate(BigDecimal couponRate) {
	    this.couponRate = couponRate;
	}
	
	
	public boolean getIsCallable() {
	    return this.isCallable;
	}
	
	public void setIsCallable(boolean isCallable) {
	    this.isCallable = isCallable;
	}
	
	
	public boolean getIsZeroCoupon() {
	    return this.isZeroCoupon;
	}
	
	public void setIsZeroCoupon(boolean isZeroCoupon) {
	    this.isZeroCoupon = isZeroCoupon;
	}
	
	
	public Frequency getPayFrequency() {
	    return this.payFrequency;
	}
	
	public void setPayFrequency(Frequency payFrequency) {
	    this.payFrequency = payFrequency;
	}
	
	
	public Date getIssueDate() {
	    return this.issueDate;
	}
	
	public void setIssueDate(Date issueDate) {
	    this.issueDate = issueDate;
	}
	
	
	public DayCountConvention getDayCountConvention() {
	    return this.dayCountConvention;
	}
	
	public void setDayCountConvention(DayCountConvention dayCountConvention) {
	    this.dayCountConvention = dayCountConvention;
	}
	
	
	public BusinessDayConvention getBuisnessDayConvention() {
	    return this.buisnessDayConvention;
	}
	
	public void setBuisnessDayConvention(BusinessDayConvention buisnessDayConvention) {
	    this.buisnessDayConvention = buisnessDayConvention;
	}
	
	
	public UUID getBondInsurerId() {
	    return this.bondInsurerId;
	}
	
	public void setBondInsurerId(UUID bondInsurerId) {
	    this.bondInsurerId = bondInsurerId;
	}
	
	
	public boolean getIsVariableRate() {
	    return this.isVariableRate;
	}
	
	public void setIsVariableRate(boolean isVariableRate) {
	    this.isVariableRate = isVariableRate;
	}
	
	
	public Date getNextCouponDate() {
	    return this.nextCouponDate;
	}
	
	public void setNextCouponDate(Date nextCouponDate) {
	    this.nextCouponDate = nextCouponDate;
	}
	
	
	public Date getLastCouponDate() {
	    return this.lastCouponDate;
	}
	
	public void setLastCouponDate(Date lastCouponDate) {
	    this.lastCouponDate = lastCouponDate;
	}
	
	
	public UUID getCallPutScheduleId() {
	    return this.callPutScheduleId;
	}
	
	public void setCallPutScheduleId(UUID callPutScheduleId) {
	    this.callPutScheduleId = callPutScheduleId;
	}
	
	
	public UUID getCouponScheduleId() {
	    return this.couponScheduleId;
	}
	
	public void setCouponScheduleId(UUID couponScheduleId) {
	    this.couponScheduleId = couponScheduleId;
	}
	
	
	public UUID getVariableRateScheduleId() {
	    return this.variableRateScheduleId;
	}
	
	public void setVariableRateScheduleId(UUID variableRateScheduleId) {
	    this.variableRateScheduleId = variableRateScheduleId;
	}
	
	
	@Override
    public String toString() {
        return "Debt{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", maturityDate='" + maturityDate + '\'' +
                ", parValue='" + parValue + '\'' +
                ", couponRate='" + couponRate + '\'' +
                ", isCallable='" + isCallable + '\'' +
                ", isZeroCoupon='" + isZeroCoupon + '\'' +
                ", payFrequency='" + payFrequency + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", dayCountConvention='" + dayCountConvention + '\'' +
                ", buisnessDayConvention='" + buisnessDayConvention + '\'' +
                ", bondInsurerId='" + bondInsurerId + '\'' +
                ", isVariableRate='" + isVariableRate + '\'' +
                ", nextCouponDate='" + nextCouponDate + '\'' +
                ", lastCouponDate='" + lastCouponDate + '\'' +
                ", callPutScheduleId='" + callPutScheduleId + '\'' +
                ", couponScheduleId='" + couponScheduleId + '\'' +
                ", variableRateScheduleId='" + variableRateScheduleId + '\'' +
                
                super.toString() +
                '}';
    }
    
}

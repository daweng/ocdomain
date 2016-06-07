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

public abstract class Security extends  BaseEntity 
{
	protected String name;
	protected String symbol;
	protected SymbolType symbolType;
	protected String ticker;
	protected String cusip;
	protected String isin;
	protected String sedol;
	protected String valoren;
	protected CFIDebtGroup secGroup;
	protected CFIInstrumentCategory secCategory;
	protected SecuritySubGroup secSubGroup;
	protected String cfiCode;
	protected String ricCode;
	protected String figi;
	protected String mic;
	protected String fisn;
	protected UUID localBasisCurrencyId;
	protected UUID incomeCurrencyId;
	protected UUID riskCurrencyId;
	protected UUID crossingCurrencyId;
	protected boolean isNotional;
	protected String sourceSecType;
	protected UUID exchangeId;
	protected UUID investmentTypeId;
	protected UUID issuerId;
	protected UUID priceId;
	protected UUID securityTypeId;
	//self reference
	protected UUID parentSecurityId ;
	
	public Security(){
		super();
	}
	
	public Security(UUID id, String extId, Short sourceId , String name, String symbol, SymbolType symbolType, String ticker, String cusip, String isin, String sedol, String valoren, CFIDebtGroup secGroup, CFIInstrumentCategory secCategory, SecuritySubGroup secSubGroup, String cfiCode, String ricCode, String figi, String mic, String fisn, UUID localBasisCurrencyId, UUID incomeCurrencyId, UUID riskCurrencyId, UUID crossingCurrencyId, boolean isNotional, String sourceSecType
	, UUID exchangeId, UUID investmentTypeId, UUID issuerId, UUID priceId, UUID securityTypeId
	, UUID parentSecurityId 
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
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
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public String getSymbol() {
	    return this.symbol;
	}
	
	public void setSymbol(String symbol) {
	    this.symbol = symbol;
	}
	
	
	public SymbolType getSymbolType() {
	    return this.symbolType;
	}
	
	public void setSymbolType(SymbolType symbolType) {
	    this.symbolType = symbolType;
	}
	
	
	public String getTicker() {
	    return this.ticker;
	}
	
	public void setTicker(String ticker) {
	    this.ticker = ticker;
	}
	
	
	public String getCusip() {
	    return this.cusip;
	}
	
	public void setCusip(String cusip) {
	    this.cusip = cusip;
	}
	
	
	public String getIsin() {
	    return this.isin;
	}
	
	public void setIsin(String isin) {
	    this.isin = isin;
	}
	
	
	public String getSedol() {
	    return this.sedol;
	}
	
	public void setSedol(String sedol) {
	    this.sedol = sedol;
	}
	
	
	public String getValoren() {
	    return this.valoren;
	}
	
	public void setValoren(String valoren) {
	    this.valoren = valoren;
	}
	
	
	public CFIDebtGroup getSecGroup() {
	    return this.secGroup;
	}
	
	public void setSecGroup(CFIDebtGroup secGroup) {
	    this.secGroup = secGroup;
	}
	
	
	public CFIInstrumentCategory getSecCategory() {
	    return this.secCategory;
	}
	
	public void setSecCategory(CFIInstrumentCategory secCategory) {
	    this.secCategory = secCategory;
	}
	
	
	public SecuritySubGroup getSecSubGroup() {
	    return this.secSubGroup;
	}
	
	public void setSecSubGroup(SecuritySubGroup secSubGroup) {
	    this.secSubGroup = secSubGroup;
	}
	
	
	public String getCfiCode() {
	    return this.cfiCode;
	}
	
	public void setCfiCode(String cfiCode) {
	    this.cfiCode = cfiCode;
	}
	
	
	public String getRicCode() {
	    return this.ricCode;
	}
	
	public void setRicCode(String ricCode) {
	    this.ricCode = ricCode;
	}
	
	
	public String getFigi() {
	    return this.figi;
	}
	
	public void setFigi(String figi) {
	    this.figi = figi;
	}
	
	
	public String getMic() {
	    return this.mic;
	}
	
	public void setMic(String mic) {
	    this.mic = mic;
	}
	
	
	public String getFisn() {
	    return this.fisn;
	}
	
	public void setFisn(String fisn) {
	    this.fisn = fisn;
	}
	
	
	public UUID getLocalBasisCurrencyId() {
	    return this.localBasisCurrencyId;
	}
	
	public void setLocalBasisCurrencyId(UUID localBasisCurrencyId) {
	    this.localBasisCurrencyId = localBasisCurrencyId;
	}
	
	
	public UUID getIncomeCurrencyId() {
	    return this.incomeCurrencyId;
	}
	
	public void setIncomeCurrencyId(UUID incomeCurrencyId) {
	    this.incomeCurrencyId = incomeCurrencyId;
	}
	
	
	public UUID getRiskCurrencyId() {
	    return this.riskCurrencyId;
	}
	
	public void setRiskCurrencyId(UUID riskCurrencyId) {
	    this.riskCurrencyId = riskCurrencyId;
	}
	
	
	public UUID getCrossingCurrencyId() {
	    return this.crossingCurrencyId;
	}
	
	public void setCrossingCurrencyId(UUID crossingCurrencyId) {
	    this.crossingCurrencyId = crossingCurrencyId;
	}
	
	
	public boolean getIsNotional() {
	    return this.isNotional;
	}
	
	public void setIsNotional(boolean isNotional) {
	    this.isNotional = isNotional;
	}
	
	
	public String getSourceSecType() {
	    return this.sourceSecType;
	}
	
	public void setSourceSecType(String sourceSecType) {
	    this.sourceSecType = sourceSecType;
	}
	
	
	public UUID getExchangeId() {
	    return this.exchangeId;
	}
	
	public void setExchangeId(UUID exchangeId) {
	    this.exchangeId = exchangeId;
	}
	
	
	public UUID getInvestmentTypeId() {
	    return this.investmentTypeId;
	}
	
	public void setInvestmentTypeId(UUID investmentTypeId) {
	    this.investmentTypeId = investmentTypeId;
	}
	
	
	public UUID getIssuerId() {
	    return this.issuerId;
	}
	
	public void setIssuerId(UUID issuerId) {
	    this.issuerId = issuerId;
	}
	
	
	public UUID getPriceId() {
	    return this.priceId;
	}
	
	public void setPriceId(UUID priceId) {
	    this.priceId = priceId;
	}
	
	
	public UUID getSecurityTypeId() {
	    return this.securityTypeId;
	}
	
	public void setSecurityTypeId(UUID securityTypeId) {
	    this.securityTypeId = securityTypeId;
	}
	
	
	public UUID getParentSecurityId () {
	    return this.parentSecurityId ;
	}
	
	public void setParentSecurityId (UUID parentSecurityId ) {
	    this.parentSecurityId  = parentSecurityId ;
	}
	
	
	@Override
    public String toString() {
        return "Security{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", symbolType='" + symbolType + '\'' +
                ", ticker='" + ticker + '\'' +
                ", cusip='" + cusip + '\'' +
                ", isin='" + isin + '\'' +
                ", sedol='" + sedol + '\'' +
                ", valoren='" + valoren + '\'' +
                ", secGroup='" + secGroup + '\'' +
                ", secCategory='" + secCategory + '\'' +
                ", secSubGroup='" + secSubGroup + '\'' +
                ", cfiCode='" + cfiCode + '\'' +
                ", ricCode='" + ricCode + '\'' +
                ", figi='" + figi + '\'' +
                ", mic='" + mic + '\'' +
                ", fisn='" + fisn + '\'' +
                ", localBasisCurrencyId='" + localBasisCurrencyId + '\'' +
                ", incomeCurrencyId='" + incomeCurrencyId + '\'' +
                ", riskCurrencyId='" + riskCurrencyId + '\'' +
                ", crossingCurrencyId='" + crossingCurrencyId + '\'' +
                ", isNotional='" + isNotional + '\'' +
                ", sourceSecType='" + sourceSecType + '\'' +
                ", exchangeId='" + exchangeId + '\'' +
                ", investmentTypeId='" + investmentTypeId + '\'' +
                ", issuerId='" + issuerId + '\'' +
                ", priceId='" + priceId + '\'' +
                ", securityTypeId='" + securityTypeId + '\'' +
                ", parentSecurityId ='" + parentSecurityId  + '\'' +
                
                
                '}';
    }
    
}

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

public class Fund extends Security 
{
	protected Date openDate;
	protected Date closeDate;
	protected UUID investmentObjectiveId;
	
	public Fund(){
		super();
	}
	
	public Fund(UUID id, String extId, Short sourceId , Date openDate, Date closeDate, UUID investmentObjectiveId
	
	
	, String name, String symbol, SymbolType symbolType, String ticker, String cusip, String isin, String sedol, String valoren, CFIDebtGroup secGroup, CFIInstrumentCategory secCategory, SecuritySubGroup secSubGroup, String cfiCode, String ricCode, String figi, String mic, String fisn, UUID localBasisCurrencyId, UUID incomeCurrencyId, UUID riskCurrencyId, UUID crossingCurrencyId, boolean isNotional, String sourceSecType
	, UUID exchangeId, UUID investmentTypeId, UUID issuerId, UUID priceId, UUID securityTypeId
	, UUID parentSecurityId 
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.investmentObjectiveId = investmentObjectiveId;
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
	
	
	public UUID getInvestmentObjectiveId() {
	    return this.investmentObjectiveId;
	}
	
	public void setInvestmentObjectiveId(UUID investmentObjectiveId) {
	    this.investmentObjectiveId = investmentObjectiveId;
	}
	
	
	@Override
    public String toString() {
        return "Fund{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", openDate='" + openDate + '\'' +
                ", closeDate='" + closeDate + '\'' +
                ", investmentObjectiveId='" + investmentObjectiveId + '\'' +
                
                super.toString() +
                '}';
    }
    
}

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

public class Cash extends Security 
{
	protected String cashType;
	
	public Cash(){
		super();
	}
	
	public Cash(UUID id, String extId, Short sourceId , String cashType
	
	
	, String name, String symbol, SymbolType symbolType, String ticker, String cusip, String isin, String sedol, String valoren, CFIDebtGroup secGroup, CFIInstrumentCategory secCategory, SecuritySubGroup secSubGroup, String cfiCode, String ricCode, String figi, String mic, String fisn, UUID localBasisCurrencyId, UUID incomeCurrencyId, UUID riskCurrencyId, UUID crossingCurrencyId, boolean isNotional, String sourceSecType
	, UUID exchangeId, UUID investmentTypeId, UUID issuerId, UUID priceId, UUID securityTypeId
	, UUID parentSecurityId 
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.cashType = cashType;
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
    
	
	public String getCashType() {
	    return this.cashType;
	}
	
	public void setCashType(String cashType) {
	    this.cashType = cashType;
	}
	
	
	@Override
    public String toString() {
        return "Cash{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", cashType='" + cashType + '\'' +
                
                super.toString() +
                '}';
    }
    
}

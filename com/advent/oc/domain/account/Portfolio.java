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

public class Portfolio extends  BaseEntity 
{
	protected String code;
	protected String name;
	protected UUID benchmarkId;
	protected UUID reportingCurrencyId;
	protected UUID portfolioManagerId;
	protected UUID investmentStrategyId;
	protected UUID modelId;
	
	public Portfolio(){
		super();
	}
	
	public Portfolio(UUID id, String extId, Short sourceId , String code, String name, UUID benchmarkId, UUID reportingCurrencyId, UUID portfolioManagerId, UUID investmentStrategyId, UUID modelId
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.code = code;
        this.name = name;
        this.benchmarkId = benchmarkId;
        this.reportingCurrencyId = reportingCurrencyId;
        this.portfolioManagerId = portfolioManagerId;
        this.investmentStrategyId = investmentStrategyId;
        this.modelId = modelId;
    	
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
	
	
	public UUID getBenchmarkId() {
	    return this.benchmarkId;
	}
	
	public void setBenchmarkId(UUID benchmarkId) {
	    this.benchmarkId = benchmarkId;
	}
	
	
	public UUID getReportingCurrencyId() {
	    return this.reportingCurrencyId;
	}
	
	public void setReportingCurrencyId(UUID reportingCurrencyId) {
	    this.reportingCurrencyId = reportingCurrencyId;
	}
	
	
	public UUID getPortfolioManagerId() {
	    return this.portfolioManagerId;
	}
	
	public void setPortfolioManagerId(UUID portfolioManagerId) {
	    this.portfolioManagerId = portfolioManagerId;
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
	
	
	@Override
    public String toString() {
        return "Portfolio{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", benchmarkId='" + benchmarkId + '\'' +
                ", reportingCurrencyId='" + reportingCurrencyId + '\'' +
                ", portfolioManagerId='" + portfolioManagerId + '\'' +
                ", investmentStrategyId='" + investmentStrategyId + '\'' +
                ", modelId='" + modelId + '\'' +
                
                
                '}';
    }
    
}

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

public class Bond extends Debt 
{
	
	public Bond(){
		super();
	}
	
	public Bond(UUID id, String extId, Short sourceId 
	
	
	, Date maturityDate, BigDecimal parValue, BigDecimal couponRate, boolean isCallable, boolean isZeroCoupon, Frequency payFrequency, Date issueDate, DayCountConvention dayCountConvention, BusinessDayConvention buisnessDayConvention, UUID bondInsurerId, boolean isVariableRate, Date nextCouponDate, Date lastCouponDate
	, UUID callPutScheduleId, UUID couponScheduleId, UUID variableRateScheduleId
	
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
    	
    }
    
	
	@Override
    public String toString() {
        return "Bond{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                
                super.toString() +
                '}';
    }
    
}

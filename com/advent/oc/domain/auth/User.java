package com.advent.oc.domain.auth;

import com.advent.oc.domain.core.*;
import com.advent.oc.base.BaseEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class User extends  BaseEntity 
{
	protected String name;
	protected String email;
	protected String locale;
	
	public User(){
		super();
	}
	
	public User(UUID id, String extId, Short sourceId , String name, String email, String locale
	
	
	) {
        this.id = id;
        this.extId = extId;
        this.sourceId = sourceId;
        this.name = name;
        this.email = email;
        this.locale = locale;
    	
    }
    
	
	public String getName() {
	    return this.name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	
	public String getEmail() {
	    return this.email;
	}
	
	public void setEmail(String email) {
	    this.email = email;
	}
	
	
	public String getLocale() {
	    return this.locale;
	}
	
	public void setLocale(String locale) {
	    this.locale = locale;
	}
	
	
	@Override
    public String toString() {
        return "User{" +
                "Id=" + id +
                ", extId='" + extId + '\'' +
                ", sourceId=" + sourceId +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", locale='" + locale + '\'' +
                
                
                '}';
    }
    
}

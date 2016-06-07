package com.advent.oc.domain.relationship;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


public class AccountPortfolioPK implements Serializable
{
    
    protected UUID portfolioId;
    protected UUID accountId;
    
    public AccountPortfolioPK() {}
    
    public AccountPortfolioPK(UUID accountId, UUID portfolioId) {
        this.portfolioId = portfolioId;
        this.accountId = accountId;
    }
    
    @Id
    @Column(name = "PortfolioId", columnDefinition="uniqueidentifier")
    public UUID getPortfolioId() {
        return this.portfolioId;
    }
    
    public void setPortfolioId(UUID portfolioId) {
        this.portfolioId = portfolioId;
    }
    
    @Id
    @Column(name = "AccountId", columnDefinition="uniqueidentifier")
    public UUID getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountPortfolioPK that = (AccountPortfolioPK) o;

        if (!portfolioId.equals(that.portfolioId)) return false;
        return accountId.equals(that.accountId);

    }

    @Override
    public int hashCode() {
        int result = portfolioId.hashCode();
        result = 31 * result + accountId.hashCode();
        return result;
    }
}



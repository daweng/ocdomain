package com.advent.oc.domain.relationship;

import org.apache.ignite.cache.query.annotations.QuerySqlField;
import com.advent.oc.base.BaseRelationshipEntity;
import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "AccountPortfolio")
@IdClass(AccountPortfolioPK.class)
public class AccountPortfolio extends BaseRelationshipEntity
{
    @QuerySqlField(index = true)
    protected UUID portfolioId;
    @QuerySqlField(index = true)
    protected UUID accountId;
    
    public AccountPortfolio() {}
    
    public AccountPortfolio(UUID accountId, UUID portfolioId, Short sourceId) {
        this.portfolioId = portfolioId;
        this.accountId = accountId;
        this.sourceId = sourceId;
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
    
}



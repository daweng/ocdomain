package com.advent.oc.domain.relationship;

import org.apache.ignite.cache.query.annotations.QuerySqlField;
import com.advent.oc.base.BaseRelationshipEntity;
import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "PortfolioPortfolio")
@IdClass(PortfolioPortfolioPK.class)
public class PortfolioPortfolio extends BaseRelationshipEntity
{
    @QuerySqlField(index = true)
    protected UUID childPortfolioId;
    @QuerySqlField(index = true)
    protected UUID parentPortfolioId;
    
    public PortfolioPortfolio() {}
    
    public PortfolioPortfolio(UUID parentPortfolioId, UUID childPortfolioId, Short sourceId) {
        this.childPortfolioId = childPortfolioId;
        this.parentPortfolioId = parentPortfolioId;
        this.sourceId = sourceId;
    }
    
    @Id
    @Column(name = "ChildPortfolioId", columnDefinition="uniqueidentifier")
    public UUID getChildPortfolioId() {
        return this.childPortfolioId;
    }
    
    public void setChildPortfolioId(UUID childPortfolioId) {
        this.childPortfolioId = childPortfolioId;
    }
    
    @Id
    @Column(name = "ParentPortfolioId", columnDefinition="uniqueidentifier")
    public UUID getParentPortfolioId() {
        return this.parentPortfolioId;
    }
    
    public void setParentPortfolioId(UUID parentPortfolioId) {
        this.parentPortfolioId = parentPortfolioId;
    }
    
}



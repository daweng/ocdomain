package com.advent.oc.domain.relationship;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


public class PortfolioPortfolioPK implements Serializable
{
    
    protected UUID childPortfolioId;
    protected UUID parentPortfolioId;
    
    public PortfolioPortfolioPK() {}
    
    public PortfolioPortfolioPK(UUID parentPortfolioId, UUID childPortfolioId) {
        this.childPortfolioId = childPortfolioId;
        this.parentPortfolioId = parentPortfolioId;
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PortfolioPortfolioPK that = (PortfolioPortfolioPK) o;

        if (!childPortfolioId.equals(that.childPortfolioId)) return false;
        return parentPortfolioId.equals(that.parentPortfolioId);

    }

    @Override
    public int hashCode() {
        int result = childPortfolioId.hashCode();
        result = 31 * result + parentPortfolioId.hashCode();
        return result;
    }
}



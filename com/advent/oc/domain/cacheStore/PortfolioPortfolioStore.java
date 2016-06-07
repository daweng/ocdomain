package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.relation.AbstractHibernateRelationshipStore;
import com.advent.oc.domain.relationship.PortfolioPortfolio;
import com.advent.oc.domain.relationship.PortfolioPortfolioPK;
import org.springframework.stereotype.Component;

@Component
public class PortfolioPortfolioStore extends AbstractHibernateRelationshipStore<PortfolioPortfolioPK, PortfolioPortfolio> {
}

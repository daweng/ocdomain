package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.relation.AbstractHibernateRelationshipStore;
import com.advent.oc.domain.relationship.AccountPortfolio;
import com.advent.oc.domain.relationship.AccountPortfolioPK;
import org.springframework.stereotype.Component;

@Component
public class AccountPortfolioStore extends AbstractHibernateRelationshipStore<AccountPortfolioPK, AccountPortfolio> {
}

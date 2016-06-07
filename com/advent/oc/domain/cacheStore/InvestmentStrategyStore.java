package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.InvestmentStrategy;
import com.advent.oc.domain.entry.InvestmentStrategyEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class InvestmentStrategyStore extends AbstractHibernateBlobStore<UUID, InvestmentStrategy, InvestmentStrategyEntry> {
}

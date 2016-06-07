package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.MarketValueRankedRebalance;
import com.advent.oc.domain.entry.MarketValueRankedRebalanceEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class MarketValueRankedRebalanceStore extends AbstractHibernateBlobStore<UUID, MarketValueRankedRebalance, MarketValueRankedRebalanceEntry> {
}

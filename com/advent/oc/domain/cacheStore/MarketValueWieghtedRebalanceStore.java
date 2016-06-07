package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.MarketValueWieghtedRebalance;
import com.advent.oc.domain.entry.MarketValueWieghtedRebalanceEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class MarketValueWieghtedRebalanceStore extends AbstractHibernateBlobStore<UUID, MarketValueWieghtedRebalance, MarketValueWieghtedRebalanceEntry> {
}

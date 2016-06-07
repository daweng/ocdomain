package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.transaction.calc.MarketValue;
import com.advent.oc.domain.entry.MarketValueEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class MarketValueStore extends AbstractHibernateBlobStore<UUID, MarketValue, MarketValueEntry> {
}

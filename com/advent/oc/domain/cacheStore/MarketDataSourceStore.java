package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.marketdata.MarketDataSource;
import com.advent.oc.domain.entry.MarketDataSourceEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class MarketDataSourceStore extends AbstractHibernateBlobStore<UUID, MarketDataSource, MarketDataSourceEntry> {
}

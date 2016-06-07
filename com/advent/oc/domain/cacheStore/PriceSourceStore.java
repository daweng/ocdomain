package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.marketdata.PriceSource;
import com.advent.oc.domain.entry.PriceSourceEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class PriceSourceStore extends AbstractHibernateBlobStore<UUID, PriceSource, PriceSourceEntry> {
}

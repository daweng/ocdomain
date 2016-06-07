package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.marketdata.Price;
import com.advent.oc.domain.entry.PriceEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class PriceStore extends AbstractHibernateBlobStore<UUID, Price, PriceEntry> {
}

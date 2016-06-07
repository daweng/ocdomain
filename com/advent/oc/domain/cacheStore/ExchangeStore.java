package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.marketdata.Exchange;
import com.advent.oc.domain.entry.ExchangeEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ExchangeStore extends AbstractHibernateBlobStore<UUID, Exchange, ExchangeEntry> {
}

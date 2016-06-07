package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.core.ExchangeRate;
import com.advent.oc.domain.entry.ExchangeRateEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ExchangeRateStore extends AbstractHibernateBlobStore<UUID, ExchangeRate, ExchangeRateEntry> {
}

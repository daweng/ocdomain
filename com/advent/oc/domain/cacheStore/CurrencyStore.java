package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.core.Currency;
import com.advent.oc.domain.entry.CurrencyEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class CurrencyStore extends AbstractHibernateBlobStore<UUID, Currency, CurrencyEntry> {
}

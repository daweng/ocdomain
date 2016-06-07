package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.TradingUnit;
import com.advent.oc.domain.entry.TradingUnitEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class TradingUnitStore extends AbstractHibernateBlobStore<UUID, TradingUnit, TradingUnitEntry> {
}

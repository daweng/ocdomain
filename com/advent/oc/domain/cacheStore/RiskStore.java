package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.marketdata.Risk;
import com.advent.oc.domain.entry.RiskEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class RiskStore extends AbstractHibernateBlobStore<UUID, Risk, RiskEntry> {
}

package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.transaction.calc.GainLoss;
import com.advent.oc.domain.entry.GainLossEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class GainLossStore extends AbstractHibernateBlobStore<UUID, GainLoss, GainLossEntry> {
}

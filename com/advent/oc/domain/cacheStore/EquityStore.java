package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.Equity;
import com.advent.oc.domain.entry.EquityEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class EquityStore extends AbstractHibernateBlobStore<UUID, Equity, EquityEntry> {
}

package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.legalentity.Trader;
import com.advent.oc.domain.entry.TraderEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class TraderStore extends AbstractHibernateBlobStore<UUID, Trader, TraderEntry> {
}

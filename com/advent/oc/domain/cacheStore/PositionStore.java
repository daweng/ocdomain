package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.transaction.Position;
import com.advent.oc.domain.entry.PositionEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class PositionStore extends AbstractHibernateBlobStore<UUID, Position, PositionEntry> {
}

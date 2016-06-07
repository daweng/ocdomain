package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.Index;
import com.advent.oc.domain.entry.IndexEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class IndexStore extends AbstractHibernateBlobStore<UUID, Index, IndexEntry> {
}

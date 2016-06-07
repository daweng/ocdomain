package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.core.Region;
import com.advent.oc.domain.entry.RegionEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class RegionStore extends AbstractHibernateBlobStore<UUID, Region, RegionEntry> {
}

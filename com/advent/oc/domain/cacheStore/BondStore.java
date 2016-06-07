package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.Bond;
import com.advent.oc.domain.entry.BondEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class BondStore extends AbstractHibernateBlobStore<UUID, Bond, BondEntry> {
}

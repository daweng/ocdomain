package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.BaseRate;
import com.advent.oc.domain.entry.BaseRateEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class BaseRateStore extends AbstractHibernateBlobStore<UUID, BaseRate, BaseRateEntry> {
}

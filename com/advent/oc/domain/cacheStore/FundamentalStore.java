package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.marketdata.Fundamental;
import com.advent.oc.domain.entry.FundamentalEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class FundamentalStore extends AbstractHibernateBlobStore<UUID, Fundamental, FundamentalEntry> {
}

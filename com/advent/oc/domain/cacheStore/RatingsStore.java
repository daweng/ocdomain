package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.marketdata.Ratings;
import com.advent.oc.domain.entry.RatingsEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class RatingsStore extends AbstractHibernateBlobStore<UUID, Ratings, RatingsEntry> {
}

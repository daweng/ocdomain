package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.Rank;
import com.advent.oc.domain.entry.RankEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class RankStore extends AbstractHibernateBlobStore<UUID, Rank, RankEntry> {
}

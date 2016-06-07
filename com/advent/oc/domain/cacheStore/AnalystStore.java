package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.legalentity.Analyst;
import com.advent.oc.domain.entry.AnalystEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class AnalystStore extends AbstractHibernateBlobStore<UUID, Analyst, AnalystEntry> {
}

package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.legalentity.LegalEntity;
import com.advent.oc.domain.entry.LegalEntityEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class LegalEntityStore extends AbstractHibernateBlobStore<UUID, LegalEntity, LegalEntityEntry> {
}

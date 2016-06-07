package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.legalentity.Individual;
import com.advent.oc.domain.entry.IndividualEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class IndividualStore extends AbstractHibernateBlobStore<UUID, Individual, IndividualEntry> {
}

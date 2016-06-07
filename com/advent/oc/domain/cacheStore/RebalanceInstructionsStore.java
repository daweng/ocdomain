package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.RebalanceInstructions;
import com.advent.oc.domain.entry.RebalanceInstructionsEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class RebalanceInstructionsStore extends AbstractHibernateBlobStore<UUID, RebalanceInstructions, RebalanceInstructionsEntry> {
}

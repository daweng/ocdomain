package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.classification.ClassificationSystem;
import com.advent.oc.domain.entry.ClassificationSystemEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ClassificationSystemStore extends AbstractHibernateBlobStore<UUID, ClassificationSystem, ClassificationSystemEntry> {
}

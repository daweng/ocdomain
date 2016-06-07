package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.classification.Classification;
import com.advent.oc.domain.entry.ClassificationEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ClassificationStore extends AbstractHibernateBlobStore<UUID, Classification, ClassificationEntry> {
}

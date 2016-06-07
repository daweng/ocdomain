package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.classification.ClassificationType;
import com.advent.oc.domain.entry.ClassificationTypeEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ClassificationTypeStore extends AbstractHibernateBlobStore<UUID, ClassificationType, ClassificationTypeEntry> {
}

package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.ModelType;
import com.advent.oc.domain.entry.ModelTypeEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ModelTypeStore extends AbstractHibernateBlobStore<UUID, ModelType, ModelTypeEntry> {
}

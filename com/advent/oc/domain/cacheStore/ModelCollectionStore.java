package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.ModelCollection;
import com.advent.oc.domain.entry.ModelCollectionEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ModelCollectionStore extends AbstractHibernateBlobStore<UUID, ModelCollection, ModelCollectionEntry> {
}

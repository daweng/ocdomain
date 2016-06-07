package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.ModelReference;
import com.advent.oc.domain.entry.ModelReferenceEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ModelReferenceStore extends AbstractHibernateBlobStore<UUID, ModelReference, ModelReferenceEntry> {
}

package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.Model;
import com.advent.oc.domain.entry.ModelEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ModelStore extends AbstractHibernateBlobStore<UUID, Model, ModelEntry> {
}

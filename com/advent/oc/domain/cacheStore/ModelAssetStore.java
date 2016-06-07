package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.ModelAsset;
import com.advent.oc.domain.entry.ModelAssetEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ModelAssetStore extends AbstractHibernateBlobStore<UUID, ModelAsset, ModelAssetEntry> {
}

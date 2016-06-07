package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.auth.Resource;
import com.advent.oc.domain.entry.ResourceEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ResourceStore extends AbstractHibernateBlobStore<UUID, Resource, ResourceEntry> {
}

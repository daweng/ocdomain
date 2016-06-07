package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.model.Target;
import com.advent.oc.domain.entry.TargetEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class TargetStore extends AbstractHibernateBlobStore<UUID, Target, TargetEntry> {
}

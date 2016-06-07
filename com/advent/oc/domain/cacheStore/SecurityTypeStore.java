package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.SecurityType;
import com.advent.oc.domain.entry.SecurityTypeEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class SecurityTypeStore extends AbstractHibernateBlobStore<UUID, SecurityType, SecurityTypeEntry> {
}

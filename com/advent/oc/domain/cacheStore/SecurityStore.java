package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.Security;
import com.advent.oc.domain.entry.SecurityEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class SecurityStore extends AbstractHibernateBlobStore<UUID, Security, SecurityEntry> {
}

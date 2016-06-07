package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.AssetBackedSecurity;
import com.advent.oc.domain.entry.AssetBackedSecurityEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class AssetBackedSecurityStore extends AbstractHibernateBlobStore<UUID, AssetBackedSecurity, AssetBackedSecurityEntry> {
}

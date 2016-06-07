package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.auth.Permission;
import com.advent.oc.domain.entry.PermissionEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class PermissionStore extends AbstractHibernateBlobStore<UUID, Permission, PermissionEntry> {
}

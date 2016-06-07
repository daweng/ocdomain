package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.auth.Role;
import com.advent.oc.domain.entry.RoleEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class RoleStore extends AbstractHibernateBlobStore<UUID, Role, RoleEntry> {
}

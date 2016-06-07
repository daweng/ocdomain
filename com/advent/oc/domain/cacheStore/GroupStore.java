package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.auth.Group;
import com.advent.oc.domain.entry.GroupEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class GroupStore extends AbstractHibernateBlobStore<UUID, Group, GroupEntry> {
}

package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.auth.Activity;
import com.advent.oc.domain.entry.ActivityEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ActivityStore extends AbstractHibernateBlobStore<UUID, Activity, ActivityEntry> {
}

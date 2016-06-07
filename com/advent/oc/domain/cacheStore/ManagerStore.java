package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.legalentity.Manager;
import com.advent.oc.domain.entry.ManagerEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ManagerStore extends AbstractHibernateBlobStore<UUID, Manager, ManagerEntry> {
}

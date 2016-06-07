package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.legalentity.Organization;
import com.advent.oc.domain.entry.OrganizationEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class OrganizationStore extends AbstractHibernateBlobStore<UUID, Organization, OrganizationEntry> {
}

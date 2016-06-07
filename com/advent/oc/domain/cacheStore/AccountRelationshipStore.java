package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.account.AccountRelationship;
import com.advent.oc.domain.entry.AccountRelationshipEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class AccountRelationshipStore extends AbstractHibernateBlobStore<UUID, AccountRelationship, AccountRelationshipEntry> {
}

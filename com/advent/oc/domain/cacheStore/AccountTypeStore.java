package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.account.AccountType;
import com.advent.oc.domain.entry.AccountTypeEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class AccountTypeStore extends AbstractHibernateBlobStore<UUID, AccountType, AccountTypeEntry> {
}

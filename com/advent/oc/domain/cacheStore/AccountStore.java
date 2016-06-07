package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.account.Account;
import com.advent.oc.domain.entry.AccountEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class AccountStore extends AbstractHibernateBlobStore<UUID, Account, AccountEntry> {
}

package com.advent.oc.domain.cacheStore;

import com.advent.oc.cache.hibernateStore.blob.AbstractHibernateBlobStore;
import com.advent.oc.domain.security.Debt;
import com.advent.oc.domain.entry.DebtEntry;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class DebtStore extends AbstractHibernateBlobStore<UUID, Debt, DebtEntry> {
}
